/* Count number of prime digit in a Number 
 * Input : 254786135
 * Output : 5
*/
import java.util.*;
public class primeInASeries
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String num=sc.nextLine();
        int c=0;
        for(int i=0;i<num.length();i++)
        {
            char ch=num.charAt(i);
            if(ch=='2' || ch=='3' || ch=='5' || ch=='7')
            {
                c++;
            }
        }
        System.out.print(" "+c);
        sc.close();
    }
}
