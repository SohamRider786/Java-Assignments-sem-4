
import java.util.*;
class student1
{
    int roll,score;
    String name;
    student1()
    {

    }
    student1(int roll)
    {
        this.roll=roll;
    }
    student1(int roll,String name)
    {
        this.roll=roll;
        this.name=name;
    }
    student1(int roll,String name,int score)
    {
        this.roll=roll;
        this.score=score;
        this.name=name;
    }
    student1(student1 s)
    {
        this.name=s.name;
        this.roll=s.roll;
        this.score=s.score;
    }
    void display()
    {
        System.out.println(name);
        System.out.println(roll);
        System.out.println(score);
    }
}
public class q8 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        String name;
        int roll,score;
        name=sc.nextLine();
        roll=sc.nextInt();
        score=sc.nextInt();
        student1 o1=new student1();
        student1 o2=new student1(roll);
        student1 o3=new student1(roll,name);
        student1 o4=new student1(roll,name,score);
        o1.display();
        o2.display();
        o3.display();
        o4.display();
        student1 o5=new student1(o4);
    }
}
