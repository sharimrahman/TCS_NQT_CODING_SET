import java.util.*;
public class firstLetterInWord
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] arr=str.split(" ");
        sc.close();
        for(int i=0;i<arr.length;i++)
        {
            String word=arr[i];
            System.out.println(word.charAt(0));
        }
    }
}