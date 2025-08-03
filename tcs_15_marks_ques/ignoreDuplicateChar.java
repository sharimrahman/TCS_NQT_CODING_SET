/*Write a Java program to find the first non-repeated character in a given string.
Here's an example of the expected input and output:
Input string: "minimum"
Output: "minu"
*/
import java.util.*;
public class ignoreDuplicateChar 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String temp="";
        sc.close();
        for(int i=0;i<str.length();i++)
        {
            if(temp.indexOf(str.charAt(i))==-1)
            {
                temp=temp+str.charAt(i);
            }
        }
        System.out.println(temp);
    }
}        
