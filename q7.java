import java.util.*;
class student
{
    int roll,score;
    String name;
    student()
    {

    }
    student(student s)
    {
        this.roll=s.roll;
        this.score=s.score;
        this.name=s.name;
    }
    void setdata(int roll,int score,String name)
    {
        this.roll=roll;
        this.score=score;
        this.name=name;
    }
    void display()
    {
        System.out.println("the student details are as follows:-");
        System.out.println(name);
        System.out.println(roll);
        System.out.println(score);
    }
}
public class q7 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String name;
        int roll,score;
        name=sc.nextLine();
        roll=sc.nextInt();
        score=sc.nextInt();
        student ob=new student();
        ob.setdata(roll,score,name);
        ob.display();
        student oc=new student(ob);
    }
}
