/* Last Character of each word of a sentence
 * Input: Kalyani Government Engineering College
 * Output: itge
 * Ignore digits and whitespaces
 */

import java.util.*;
 public class lastCharInString 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String nstr=str+" ";
        for(int i=0;i<nstr.length();i++)
        {
            if(nstr.charAt(i)==' ')
            {
                System.out.println(nstr.charAt(i-1));
            }
        }
        sc.close();
}
}

/*
 * String str=sc.nextLine();
        String[] nstr=str.split(" ");
        sc.close();
        for(int i=0;i<nstr.length;i++)
        {
            String word=nstr[i];
            char ch=word.charAt(word.length()-1);
            if(Character.isDigit(ch))
            {
                continue;
            }
            System.out.print(ch);
        }
    }
        This is also a method or second way of doing this
 */
