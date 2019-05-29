// cc MaxTemperature Application to find the maximum temperature in the weather dataset
// vv MaxTemperature
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.conf.Configuration;

public class MaxTemperature {

  public static void main(String[] args) throws Exception {
    if (args.length != 2) {
      System.err.println("Usage: MaxTemperature <input path> <output path>");
      System.exit(-1);
    }
    Configuration conf1=new Configuration();
    Job job = new Job(conf1);
    job.setJarByClass(MaxTemperature.class);
    job.setJobName("Ashok-Station-Date Pair");
    FileInputFormat.addInputPath(job, new Path(args[0]));
    FileOutputFormat.setOutputPath(job, new Path(args[1]+ "/temp"));
    job.setMapperClass(Mapperone.class);
    job.setReducerClass(Reducerone.class);
    job.setOutputKeyClass(Text.class);
    job.setOutputValueClass(IntWritable.class);

   
    Configuration conf2=new Configuration();
    Job job1 = new Job(conf2);
    job1.setJarByClass(MaxTemperature.class);
    job1.setJobName("Ashok-Station-Day-Month Pair");
    FileInputFormat.addInputPath(job1, new Path(args[1]+ "/temp"));
    FileOutputFormat.setOutputPath(job1, new Path(args[1]+ "/final"));
    job1.setMapperClass(Mappertwo.class);
    job1.setReducerClass(Reducertwo.class);
    job1.setOutputKeyClass(Text.class);
    job1.setOutputValueClass(IntWritable.class);
    
    System.exit(job.waitForCompletion(true) && job1.waitForCompletion(true) ? 0 : 1);
  }
}
// ^^ MaxTemperature
