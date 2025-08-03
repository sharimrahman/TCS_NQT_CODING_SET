import java.util.*;
public class fact_solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            int num=sc.nextInt();
            int fact=1;
            for(int j=1;j<=num;j++)
            {
                fact*=j;
            }
            System.out.println(fact);
        }
        sc.close();
    }
}
