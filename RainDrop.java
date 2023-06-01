import java.util.*;
public class codemind
{
    public static void main(String args[])
    {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a%3==0)
        {
            System.out.printf("Pling");
        }
        if(a%5==0)
        {
            System.out.printf("Plang");
        }
        if(a%7==0)
        {
            System.out.println("Plong");
        }
        if(a%3!=0 && a%5!=0 && a%7!=0)
        {
            System.out.printf("%d",a);
        }
    }
}