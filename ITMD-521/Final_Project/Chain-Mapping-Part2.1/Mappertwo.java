// cc MaxTemperatureMapper Mapper for maximum temperature example
// vv MaxTemperatureMapper
import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class Mappertwo  extends Mapper<Text, IntWritable, Text, IntWritable> {


  @Override
  public void map(Text key, IntWritable value, Context context)
      throws IOException, InterruptedException {
        String k=key.toString();
        int l=k.length();
        String s=k.substring(0,15);
        String m=k.substring(15,l);
        String newkey= s+" "+m;
        context.write(new Text(newkey),value);    
  }
}

