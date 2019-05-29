import java.io.IOException;

import com.cloudera.sqoop.lib.RecordParser.ParseError;

import org.apache.hadoop.conf.*;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.*;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.*;

public class MinTemperaturePerYear extends Configured implements Tool {

  public static class MinTemperatureMapper
      extends Mapper<LongWritable, Text, LongWritable, Station> {

    private Station mintemp = null;

    public void map(LongWritable k, Text v, Context context) {
      Station widget = new Station();
      try {
        widget.parse(v); // Auto-generated: parse all fields from text.
      } catch (ParseError pe) {
        // Got a malformed record. Ignore it.
        return;
      }

      Integer id = widget.get_Air_Temperature();
      if (null == id) {
        return;
      } else {
        if (mintemp == null
            || id.intValue() < mintemp.get_Air_Temperature().intValue()) {
          mintemp = widget;
        }
      }
    }

    public void cleanup(Context context)
        throws IOException, InterruptedException {
      if (null != mintemp) {
        context.write(new LongWritable(mintemp.get_Year()), mintemp);
      }
    }
  }

  public static class MinTemperatureReducer
      extends Reducer<LongWritable, Station, LongWritable, IntWritable> {

    // There will be a single reduce call with key '0' which gets
    // the max widget from each map task. Pick the max widget from
    // this list.
    public void reduce(LongWritable k, Iterable<Station> vals, Context context)
        throws IOException, InterruptedException {
      Station mintemp = null;

      for (Station w : vals) {
        if (mintemp == null
            || w.get_Air_Temperature().intValue() < mintemp.get_Air_Temperature().intValue()) {
          try {
            mintemp = (Station) w.clone();
          } catch (CloneNotSupportedException cnse) {
            // Shouldn't happen; Sqoop-generated classes support clone().
            throw new IOException(cnse);
          }
        }
      }

      if (null != mintemp) {
        context.write(k,new IntWritable(mintemp.get_Air_Temperature()));
      }
    }
  }

  public int run(String [] args) throws Exception {
    Job job = new Job(getConf());

    job.setJarByClass(MinTemperaturePerYear.class);

    job.setMapperClass(MinTemperatureMapper.class);
    job.setReducerClass(MinTemperatureReducer.class);

    FileInputFormat.addInputPath(job, new Path("dataperyear"));
    FileOutputFormat.setOutputPath(job, new Path("MinTemperature"));

    job.setMapOutputKeyClass(LongWritable.class);
    job.setMapOutputValueClass(Station.class);

    job.setOutputKeyClass(Station.class);
    job.setOutputValueClass(NullWritable.class);

    job.setNumReduceTasks(1);

    if (!job.waitForCompletion(true)) {
      return 1; // error.
    }

    return 0;
  }

  public static void main(String [] args) throws Exception {
    int ret = ToolRunner.run(new MinTemperaturePerYear(), args);
    System.exit(ret);
  }
}
