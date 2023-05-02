import java.util.*;

// class shhow 
// {
//     void show(int a)
//     {
//         System.out.println(a);
//     }
// }
class shoow
{
    void show(int a)
    {
        System.out.println(a);
    }
    void show(double a)
    {
        System.out.println(a);
    }
}
public class q6
{
    public static void main(String args[])
    {
        short a;
        double b;
        Scanner sc=new Scanner (System.in);
        a=sc.nextShort();
        b=sc.nextDouble();
        shoow oc=new shoow();
        oc.show(a);
        oc.show(b);
        oc.show(a);
        oc.show(b);
    }
}
