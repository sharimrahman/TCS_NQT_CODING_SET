import java.util.*;
public class secondLargestPrime
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int largestPrime=-1;
        int secondLargestPrime=-1;
        for(int i=0;i<n;i++)
        {
            int num=sc.nextInt();
            int isPrime=1;
            if(num<2)
            {
                isPrime=0;
            }
            else
            {
                for(int j=2;j<num;j++)
                {
                    if(num%j==0)
                    {
                        isPrime=0;
                        break;
                    }
                }
            }
            if(isPrime==1)
            {
                if(num>largestPrime)
                {
                    secondLargestPrime=largestPrime;
                    largestPrime=num;
                }
                else if(num>secondLargestPrime && num!=largestPrime)
                {
                    secondLargestPrime=num;
                }
            }
        }
        if(secondLargestPrime!=-1)
        {
            System.out.println(secondLargestPrime);
        }
        else
        {
            System.out.println("Not enough prime numbers");
        }
        sc.close();
    }
}
