import java.util.*;
class circle
{
    private int radius;
    circle(int radius)
    {
        this.radius=radius;
    }
    double calculate()
    {
        return 3.14*radius*radius;
    }
}
public class q3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        final double pi=3.14;
        int r=sc.nextInt();
        double area;
        circle a=new circle(r);
        area=a.calculate();
        System.out.println(area);
    }
}
