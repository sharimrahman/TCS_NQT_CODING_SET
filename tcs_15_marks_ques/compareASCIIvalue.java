/*
Write main method in Solution class.
The method will read a String value and print the minimum valued character (as per alphabet and ASCIl sequence).
Consider below sample input and output:
Input:
HellO
Output:
H
Important: Answer is not 'e' since 'H' has lower ASCIl value then 'e'
*/

import java.util.*;
public class compareASCIIvalue
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    char ch=str.charAt(0);
    for(int i=0;i<str.length();i++)
    {
        if(str.charAt(i)<ch)
        {
            ch=str.charAt(i);
        }
    }
    System.out.println(ch);
    sc.close();
    }
}
