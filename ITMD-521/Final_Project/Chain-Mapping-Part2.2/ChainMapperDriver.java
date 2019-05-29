import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.chain.ChainMapper;
import org.apache.hadoop.mapreduce.lib.chain.ChainReducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.GenericOptionsParser;
import org.apache.hadoop.mapred.JobConf;

public class ChainMapperDriver {

  public static void main(String[] args) throws Exception {
    if (args.length != 2) {
      System.err.println("Usage: ChainMapperDriver <input path> <output path>");
      System.exit(-1);
    }

    Job job = Job.getInstance();
    job.setJobName("Ashok-Station-Day-Month Pair");
    FileInputFormat.addInputPath(job, new Path(args[0]));
    FileOutputFormat.setOutputPath(job, new Path(args[1]));
    JobConf map1Conf = new JobConf(false);
    ChainMapper.addMapper(job,Mapperone.class,LongWritable.class,Text.class,Text.class,IntWritable.class,map1Conf);
	  JobConf map2Conf = new JobConf(false);
	  ChainMapper.addMapper(job,Mappertwo.class,Text.class,IntWritable.class,Text.class,IntWritable.class,map2Conf);
    job.setReducerClass(Reducertwo.class);
    job.setJarByClass(ChainMapperDriver.class);
    job.setOutputKeyClass(Text.class);
    job.setOutputValueClass(IntWritable.class);
    System.exit(job.waitForCompletion(true) ? 0 : 1);}}
