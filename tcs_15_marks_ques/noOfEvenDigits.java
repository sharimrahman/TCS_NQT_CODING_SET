/*Number of even digits in a number
 * Input: 2346
 * Output: 3
 */

import java.util.*;
public class noOfEvenDigits
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int rem;
        int count=0;
        sc.close();
        while(no>0)
        {
            rem=no%10;
            if(rem%2==0)
            {
                count++;
            }
            no=no/10;
        }
        System.out.println(count);
    }
}
