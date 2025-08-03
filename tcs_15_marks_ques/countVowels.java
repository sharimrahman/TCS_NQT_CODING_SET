/*
 * In the main method, read a string and find the count of words starting with a vowel in the string. If no words are present in the String value then it should print "No String found".
Note:
All search should be case insensitive.
Sample inputl:
Everyone should practice and learn to became professional.
Output:
2
Sample input2: hi guys
Output:
No String found
 */

import java.util.*;
public class countVowels
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] nstr=str.split(" ");
        int count=0;
        for(int i=0;i<nstr.length;i++)
        {
            String word=nstr[i];
            char ch=word.charAt(0);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E'|| ch=='I' || ch=='O' || ch=='U')
            {
                count++;
            }
        }
        if(count>0)
        {
            System.out.println(count);
        }
        else
        {
            System.out.println("No String found");
        }
        sc.close();
    }
}
