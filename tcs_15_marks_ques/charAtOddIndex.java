/* Find Characters of a string at odd index
 * Arijit = rjt
 * priyanka = ryna
*/
import java.util.*;
public class charAtOddIndex
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        for(int i=0;i<str.length();i++)
        {
            if(i%2!=0)
            {
                System.out.print(str.charAt(i));
            }
        }
    }    
}
