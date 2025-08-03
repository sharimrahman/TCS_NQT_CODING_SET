/* Find the index number of a character in a String
 * Input1 :
 --------------
  Carrot
  a
 
 * Output:
 ---------------
   1
 * Input2:
 ----------------
   Carrot
   z
 * Output:
  --------------
   NA
 */


import java.util.*;
public class alphaPosition
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char ch=sc.nextLine().charAt(0);
        if(str.indexOf(ch)==-1)
        {
          System.out.println("NA");
        }
        else
        {
           System.out.println(str.indexOf(ch));
        }
        sc.close();
    }
}