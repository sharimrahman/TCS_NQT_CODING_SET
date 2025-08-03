import java.util.*;
public class calculateSumOfDigits
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        sc.close();
        int sum=0;
        while(no>0)
        {
            int rem=no%10;
            sum=sum+rem;
            no=no/10;
        }
        if(sum%3==0)
        {
        System.out.println("true");
        }
        else
        {
        System.out.println("false");
        }
    }
}
