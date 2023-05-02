import java.util.*;
class BankAcc
{
    int accno;
    double bal;
    float interest;
    BankAcc(int accno,double bal,float interest)
    {
        this.accno=accno;
        this.bal=bal;
        this.interest=interest;
    }
    void change(float interest)
    {
        this.interest=interest;
    }
    void display()
    {
        System.out.print("acc no=");
        System.out.println(this.accno);
        System.out.print("balance=");
        System.out.println(this.bal);
        System.out.print("interest rate=");
        System.out.println(this.interest);
    }
    double calculate(int time)
    {
        return bal*interest*time/100;
    }
}
public class q9 
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the acc no=");
        int accno=sc.nextInt();
        System.out.print("enter the initial balance=");
        double bal=sc.nextDouble();
        System.out.print("enter the initial interest rate=");
        float interest=sc.nextFloat();
        BankAcc ob=new BankAcc(accno,bal,interest);
        System.out.print("enter the new intrest=");
        float new_interest=sc.nextFloat();
        ob.change(new_interest);
        ob.display();
        System.out.println("enter the time in years");
        int time=sc.nextInt();
        System.out.print("the intrest is=");
        System.out.println(ob.calculate(time));
    }
}
