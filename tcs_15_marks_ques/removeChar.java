/*
 * Input: Sharim
 *        h
 * Output: sarim
 */
import java.util.*;
public class removeChar
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char ch=sc.next().charAt(0); //this is the way to initialize char
        String remove="";
        sc.close();
        for(int i=0;i<str.length();i++)
        {
            if(ch!=str.charAt(i))
            {
                remove=remove+str.charAt(i);
            }
        }
        System.out.println(remove);
    }
}