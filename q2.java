public class q2 
{
    public static void main(String args[])
    {
        int count=0;
        count=args.length;
        if(count==0)
        System.out.println("No arguments are there");
        for(int i=0;i<count;i++)
        {
            System.out.println(args[i]);
        }
    }
}
