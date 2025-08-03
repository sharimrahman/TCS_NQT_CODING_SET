/*Perfect no
Example 6:1+2+3
*/

import java.util.Scanner;

public class perfectNo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int sum=0;
        for(int i=1;i<no;i++)
        {
            if(no%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==no)
        {
            System.out.println("Perfect No");
        }
        else
        {
            System.out.println("Not a perfect no");
        }
        sc.close();
    }
}
