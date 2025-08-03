/*Input CHNKSC
 * if first 3 letters are CHN then only reverse the next 3 letters
 * Output CSK
 */
import java.util.*;
public class CHN_CSK
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String ch="CHN";
        String rev="";
        if(str.contains(ch))   //This is the motive of this code
        {
            for(int i=str.length()-1;i>=3;i--)
            {
                rev=rev+str.charAt(i);
            }
        }
        System.out.println(rev);
        sc.close();
    }    
}
