import java.util.*;
public class vowelAtIndex0
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] nstr=str.split(" ");
        sc.close();
        for(int i=0;i<nstr.length;i++)
        {
            String word=nstr[i];
            char ch=word.charAt(0);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            {
                System.out.print(ch);
            }
        }
    }
}
