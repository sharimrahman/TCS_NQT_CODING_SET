/*Write main method in Solution class.
In the main method, write code to read a String value using Scanner and print the smallest vowel.
Assume all input values are in lower case.
E.g If the input value is "matrix" then output will be a (since there are two vowels a and i where a is smaller as per ASClI sequence).*/

import java.util.*;
public class smallestVowel
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char t='u';
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
            {
                if(t>str.charAt(i))
                {
                    t=str.charAt(i);
                }
            }
        }
        System.out.println(t);
        sc.close();
    }
}