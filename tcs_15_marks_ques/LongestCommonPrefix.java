/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters if it is non-empty.*/

import java.util.*;
public class LongestCommonPrefix
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String[] str=new String[3];
        System.out.println("Enter strings");
        for(int i=0;i<3;i++)
        {
            str[i]=sc.nextLine();
        }
        String start=str[0];
        for(int i=1;i<str.length;i++)
        {
            while(str[i].indexOf(start)!=0)
            {
                start=start.substring(0,start.length()-1);
            }
        }
        if(start.length()>0)
        {
            System.out.println(start);
        }
        else
        {
            System.out.println("No prefix");
        }
        sc.close();
    }
}
