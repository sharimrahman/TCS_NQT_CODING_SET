import java.util.*;
public class countCharAndSpace
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=0;
        int x=0;
        sc.close();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                count++;
            }
            else if(str.charAt(i)>'a' || str.charAt(i)<'z' || str.charAt(i)>'A' || str.charAt(i)<'Z')
            {
                x++;
            }
        }
        System.out.println(count+" "+x);
    }
}
