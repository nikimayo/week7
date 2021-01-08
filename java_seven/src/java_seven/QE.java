package java_seven;
import java.util.Scanner;
public class QE {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        QuadraticEquation r = new QuadraticEquation();
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if(r.getDiscriminant(a,b,c) > 0){
            System.out.println("r1 = " + r.getRoot1(a,b,c) + ", r2 = " + r.getRoot2(a,b,c));
        }else if(r.getDiscriminant(a,b,c) == 0){
            System.out.println("r1 = r2 = " + r.getRoot1(a,b,c));
        }else{
            System.out.println("The equation has no roots.");
        }
    }
}
class QuadraticEquation{
    private int a,b,c;//Ë½ÓÐÊý¾Ý
    public int get_A(int a){
        return a;
    }
    public int get_B(int b){
        return b;
    }
    public int get_C(int c){
        return c;
    }
    public int getDiscriminant(int a,int b,int c){
        return (b * b - 4 * a * c);
    }
    public double getRoot1(int a,int b,int c){
        if(getDiscriminant(a,b,c) < 0){
            return 0;
        }
        return ((-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a));
    }
    public double getRoot2(int a,int b,int c){
        if(getDiscriminant(a,b,c) < 0){
            return 0;
        }
        return ((-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a));
    }
}
