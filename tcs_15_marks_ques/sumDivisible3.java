/* Input a=12 b=100
 * The nos which are between 12 and 100 also divisible by 3
 * after that the multiples of 3 which are even
 * Sum of their even multiples of 3
 * Count of even multiples of 3
 * Output
 * Sum=810 Count=15 
 */
import java.util.*;
public class sumDivisible3
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int sum=0,count=0;
    for(int i=a;i<=b;i++)
    {
        if(i%3==0 && i%2==0)
        {
            count++;
            sum=sum+i;
            System.out.print(i+" ");
        }
    }
    System.out.println("sum="+sum+" "+"Count="+count);
    sc.close();
    }
}
