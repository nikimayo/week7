package java_seven;
import java.util.Random;
import java.util.Date;
import java.util.Timer;
public class DStopWatch {
	  public static void main(String[] args) {
	        Random l = new Random(100001);
	        double aa[] = new double[100000];
	        int i,j;
	        for(i = 0; i< 100000;++ i) {
	        	aa[i] = l.nextDouble();
	        }
	        StopWatch a = new StopWatch();
	        int min;
	        for(i = 0;i < 100000 - 1;++ i){
	            min = i;
	            
	            for( j = i + 1;j < 100000;++ j){
	                if(aa[j] < aa[min]){
	                    min = j;
	                }
	            }
	            if(i != min){
	                double tool = aa[i];
	                aa[i] = aa[min];
	                aa[min] = tool;
	            }
	        }
	        a.stop();
	        System.out.println(a.getElapsedTime()+"ms");
	    }
	}
	class StopWatch{
	    private Date startTime;
	    private Date endTime;
	    public StopWatch(){
	        startTime = new Date();
	    }
	    public void start(){
	        startTime = new Date();
	    }
	    public void stop(){
	        endTime = new Date();
	    }
	    public long getElapsedTime(){
	        return endTime.getTime() - startTime.getTime();
	    }
}
