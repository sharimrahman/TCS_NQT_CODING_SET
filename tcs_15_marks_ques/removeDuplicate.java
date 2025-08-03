/* Remove duplicate characters in a string
 * 
 * Input : Arijit Ghosh
 * Output : Arijt Ghos
 */
import java.util.*;
 public class removeDuplicate
 {
     public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String temp="";
        for(int i=0;i<str.length();i++)
        {
            if(temp.indexOf(str.charAt(i))==-1)
            {
                temp+=str.charAt(i);
            }
        }
        System.out.println(temp);
        sc.close();
    }
 }
