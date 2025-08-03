/*Write a program to read n numbers and display the second largest prime number.
The first number entered will be considered as n. Next, the program should read n numbers (no decimal values).
Consider below example as input:
6
1
3
17
33
44
43
Output will be:
17
*/
import java.util.*;
public class secondLargestPrimeNo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int flag=0;
        int[] arr=new int[5];
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
            for(int j=2;j<arr[i];j++)
            {
                if(arr[i]%j==0)
                {
                    flag=1;
                }
            }
            if(flag==0)
            {
                System.out.println("Prime="+arr[i]);
            }
            else
            {
                System.out.println("Not Prime="+arr[i]);
            }
        }
        sc.close();
    }
 

}
