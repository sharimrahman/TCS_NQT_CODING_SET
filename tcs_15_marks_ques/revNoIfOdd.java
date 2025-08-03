/* Take a number. If it odd then reverse it, otherwise print "Can not reverse"
 * 
 * Input : 123
 * Output : 321
 * 
 * Input : 234
 * Output : Can not reverse
 */

import java.util.*;
public class revNoIfOdd
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        if(num%2!=0)
        {
            while(num>0)
            {
                int rev=num%10;
                sum=sum*10+rev;
                num=num/10;
            }
        }
        System.out.println(sum);
        sc.close();
    }    
}
