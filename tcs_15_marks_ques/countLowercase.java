/* Find number of lower case
Find number of lower case in a string
 AriJIt = 3
 */
import java.util.*;
public class countLowercase 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int count=0;
        String str=sc.nextLine();
        sc.close();
        for(int i=0;i<str.length();i++)
    {
        char ch=str.charAt(i);
        if(ch>'a' && ch<'z')
        {
            count++;
        }
    }
    System.out.println(count);
    }
}
