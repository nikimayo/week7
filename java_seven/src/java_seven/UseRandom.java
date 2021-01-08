package java_seven;
import java.util.Random;
public class UseRandom {
	 public static void main(String[] args) {
	        Random l = new Random(1000);
	        for(int i=0;i<50;i++){
	            System.out.println(l.nextInt(100));
	        }
	    }

}
