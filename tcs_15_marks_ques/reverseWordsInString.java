import java.util.*;
public class reverseWordsInString
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] arr=str.split(" ");
        String rev="";
        sc.close();
        for(int i=arr.length-1;i>=0;i--)
        {
             rev=rev+arr[i]+" ";
        }
        System.out.println(rev);
    }
}
