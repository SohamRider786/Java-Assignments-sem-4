import java.util.Scanner;
class customer1
{
    String customer_id;
    double current_loan_amt;
    String name;
    String phone_no;
    String type;
    double limit;
    customer1(String customer_id,String name,String type,String phone_no)
    {
        this.customer_id=customer_id;
        this.current_loan_amt=0;
        this.name=name;
        this.phone_no=phone_no;
        this.type=type;
        if(type=="priviledged")
        {
            this.limit=1000000;
        }
        else
        {
            this.limit=500000;
        }
    }
    void seek_loan(double loan_amt)
    {
        if(loan_amt+current_loan_amt<=limit)
        {
            System.out.println("the loan can be sanctioned");
            current_loan_amt=current_loan_amt+loan_amt;
        }
        else
        {
            System.out.println("the loan cannot be sanctioned");
        }
    }
    void display()
    {
        System.out.println(this.limit);
        System.out.println(this.current_loan_amt);
        double result=limit-current_loan_amt;
        if(result>0)
        System.out.println(result);
    }
}
public class q1
{
    public static void main(String args[])
    {
        System.out.println("hi");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the customer details");
        String customer_id,name,phone_no,type;
        customer_id=sc.nextLine();
        name=sc.nextLine();
        type=sc.nextLine();
        phone_no=sc.nextLine();
        customer1 ob=new customer1(customer_id,name,type,phone_no);
        double loan_amt=sc.nextDouble();
        ob.seek_loan(loan_amt);
        ob.display();
    }
}