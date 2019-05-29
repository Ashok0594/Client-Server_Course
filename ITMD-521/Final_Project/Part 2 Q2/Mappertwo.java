// cc MaxTemperatureMapper Mapper for maximum temperature example
// vv MaxTemperatureMapper
import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class Mappertwo  extends Mapper<LongWritable, Text, Text, IntWritable> {

  private static final int MISSING = 9999;

  @Override
  public void map(LongWritable key, Text value, Context context)
      throws IOException, InterruptedException {

    String line = value.toString();
    int c=line.length();
    String k = line.substring(0, 17);
    String v=line.substring(23,c);
    v=v.replaceAll("\\s","");
    int Temperature=Integer.parseInt(v);
    context.write(new Text(k), new IntWritable(Temperature));
  }
}
// ^^ MaxTemperatureMapper
