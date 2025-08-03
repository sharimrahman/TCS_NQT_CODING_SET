import java.util.*;
public class countNoOfWords
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] arr=str.split(" ");
        int count=0;
        sc.close();
        for(int i=0;i<arr.length;i++)
        {
            count++;
        }
        System.out.println(count);
    }
}
