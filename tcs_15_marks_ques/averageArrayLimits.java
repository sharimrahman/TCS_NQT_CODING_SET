import java.util.*;
public class averageArrayLimits
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum=0,count=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int limit1=sc.nextInt();
        int limit2=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]>limit1 && arr[i]<limit2)
            {
                sum=sum+arr[i];
                count++;
            }
        }
        int average=sum/count;
        System.out.println(average);
        sc.close();
    }
}