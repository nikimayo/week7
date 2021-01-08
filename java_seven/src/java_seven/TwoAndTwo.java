package java_seven;
import java.util.Scanner;
public class TwoAndTwo {
	public static void main(String[] args) {
        System.out.print("Enter a b c d e f£º");
        LinearEquation l= new LinearEquation();
        Scanner input = new Scanner(System.in);
        l.set_a(input.nextDouble());
        l.set_b(input.nextDouble());
        l.set_c(input.nextDouble());
        l.set_d(input.nextDouble());
        l.set_e(input.nextDouble());
        l.set_f(input.nextDouble());

        if(!l.isSolvable())
        	System.out.println("The equation has no solution");
        else 
            System.out.println("x = " + l.get_x() + " , y = " + l.get_y());
        
    }
}
class LinearEquation{
    private double a,b,c,d,e,f;
    public void set_a(double x) { a = x; }
    public void set_b(double x) { b = x; }
    public void set_c(double x) { c = x; }
    public void set_d(double x) { d = x; }
    public void set_e(double x) { e = x; }
    public void set_f(double x) { f = x; }

    public double get_a() { return a;}
    public double get_b() { return b;}
    public double get_c() { return c;}
    public double get_d() { return d;}
    public double get_e() { return e;}
    public double get_f() { return f;}

    public boolean isSolvable(){
        if(a * d - b * c != 0) 
        	return true;
        else 
        	return false;
    }

    public double get_x() {
        return (e * d - b * f)/(a * d - b * c);
    }
    public double get_y() {
        return (a * f - e * c)/(a * d - b * c);
    }
}
