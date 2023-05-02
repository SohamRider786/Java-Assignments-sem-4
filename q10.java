import java.util.*;
class course
{
    String name;
    instructor ob=new instructor();
    textbook oc=new textbook();
    void set(String name,String name1,String phone_no,String title,String author,String publisher)
    {
        this.name=name;
        ob.set(name1,phone_no);
        oc.set(title,author,publisher);
    }
    void display()
    {
        System.out.println(this.name);
        ob.display();
        oc.display();
    }
}
class instructor
{
    String name;
    String phone_no;
    void set(String name,String phone_no)
    {
        this.name=name;
        this.phone_no=phone_no;
    }
    void display()
    {
        System.out.println(this.name);
        System.out.println(phone_no);
    }
}
class textbook
{
    String title;
    String author;
    String publisher;
    void set(String title,String author,String publisher)
    {
        this.title=title;
        this.author=author;
        this.publisher=publisher;
    }
    void display()
    {
        System.out.println(this.title);
        System.out.println(this.author);
        System.out.println(this.publisher);
    }
}
public class q10 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("course name=");
        String name=sc.nextLine();
        System.out.println("instructor details");
        String name1=sc.nextLine();
        String phone_no=sc.nextLine();
        System.out.println("textbook details");
        String title=sc.nextLine();
        String author=sc.nextLine();
        String publisher=sc.nextLine();
        course o=new course();
        o.set(name,name1,phone_no,title,author,publisher);
        o.display();
    }
}
