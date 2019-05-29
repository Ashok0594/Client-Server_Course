import java.io.IOException;

import com.cloudera.sqoop.lib.RecordParser.ParseError;

import org.apache.hadoop.conf.*;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.*;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.*;

public class MaxTemperaturePerYear extends Configured implements Tool {

  public static class MaxTemperatureMapper
      extends Mapper<LongWritable, Text, LongWritable, Station>  {

    private Station maxtemp = null;

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
        if (maxtemp == null
            || id.intValue() > maxtemp.get_Air_Temperature().intValue()) {
          maxtemp = widget;
        }
      }
    }

    public void cleanup(Context context)
        throws IOException, InterruptedException {
      if (null != maxtemp) {
        context.write(new LongWritable(maxtemp.get_Year()), maxtemp);
      }
    }
  }

  public static class MaxTemperatureReducer
      extends Reducer<LongWritable, Station, Station, NullWritable>  {

    // There will be a single reduce call with key '0' which gets
    // the max widget from each map task. Pick the max widget from
    // this list.
    public void reduce(LongWritable k, Iterable<Station> vals, Context context)
        throws IOException, InterruptedException {
      Station maxtemp = null;

      for (Station w : vals) {
        if (maxtemp == null
            || w.get_Air_Temperature().intValue() > maxtemp.get_Air_Temperature().intValue()) {
          try {
            maxtemp = (Station) w.clone();
          } catch (CloneNotSupportedException cnse) {
            // Shouldn't happen; Sqoop-generated classes support clone().
            throw new IOException(cnse);
          }
        }
      }

      if (null != maxtemp) {
        context.write(maxtemp, NullWritable.get());
      }
    }
  }

  public int run(String [] args) throws Exception {
    Job job = new Job(getConf());

    job.setJarByClass(MaxTemperaturePerYear.class);

    job.setMapperClass(MaxTemperatureMapper.class);
    job.setReducerClass(MaxTemperatureReducer.class);

    FileInputFormat.addInputPath(job, new Path("dataperyear"));
    FileOutputFormat.setOutputPath(job, new Path("MaxTemperature"));

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
    int ret = ToolRunner.run(new MaxTemperatureTemperaturePerYear(), args);
    System.exit(ret);
  }
}
