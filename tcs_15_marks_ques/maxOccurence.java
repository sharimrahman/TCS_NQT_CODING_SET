/*
 * Sample Input : Hello Hi Bye TCS Hello Welcome Hello Bye
    Expected Output : Hello
 */

import java.util.*;
public class maxOccurence
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] nstr=str.split(" ");
        int maxCount=0;
        String maxWord="";
        int count=0;
        for(int i=0;i<nstr.length;i++)
        {
            for(int j=i+1;j<nstr.length;j++)
            {
                if(nstr[i].equals(nstr[j]))
                {
                    count++;
                }
            }
            if(count>maxCount)
            {
                maxCount=count;
                maxWord=nstr[i];
            }
        }
        if(!maxWord.isEmpty())
        {
            System.out.println(maxWord);
        }
        sc.close();
    }
}
