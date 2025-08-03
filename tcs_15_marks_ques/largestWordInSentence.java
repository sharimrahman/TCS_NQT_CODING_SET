/* Find largest word from a given sentence
 * 
 Input: He is so funny boy
 Output: funny
 */

import java.util.*;
public class largestWordInSentence
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String largest="";
        String[] nstr=str.split(" ");
        sc.close();
        for(int i=0;i<nstr.length;i++)  //here, we use .length bcz it's an array but for strings we use .length()
        {
            if(nstr[i].length()>largest.length())
            {
                largest= nstr[i];
            }
        }
        System.out.println(largest);
    }
}
