package java_seven;
import java.util.GregorianCalendar;
public class UseGC {
	public static void main(String[] args) {
        GregorianCalendar day = new GregorianCalendar();
        int a = day.get(GregorianCalendar.YEAR);
        int b = day.get(GregorianCalendar.MONTH);
        int c = day.get(GregorianCalendar.DAY_OF_MONTH);
        long l = 1234567898765L;
        day.setTimeInMillis(l);
        System.out.println(a + " 年 " + b + "月" + c + "日");
        a = day.get(GregorianCalendar.YEAR);
        b = day.get(GregorianCalendar.MONTH);
        c = day.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println(a + " 年 " + b + "月" + c + "日");
	}
}
