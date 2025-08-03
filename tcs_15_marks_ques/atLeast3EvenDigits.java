/*Write main method in the Solution class.

In the main method, read an integer value and print "TRUE" if it contains at least 3 even digits. Else it
should print "FALSE".

For example, if the value is 123456 and it contains 3 even digits such as 2,4,6. So it should print "TRUE".
The output should be in the format of sample output.

Sample input1:
123456

Output:
TRUE

Sample input2:
123

Output:
FALSE
*/

import java.util.*;
public class atLeast3EvenDigits
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num,rem,count=0;
        num=sc.nextInt();
        while(num>0)
        {
            rem=num%10;
            if(rem%2==0)
            {
                count++;
            }
            num=num/10;
        }
        if(count>2)
        {
            System.out.println("TRUE");
        }
        else 
        {
            System.out.println("FALSE");
        }
        sc.close();
    }
}