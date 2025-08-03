/*
 * create a class Footwear which consists of the below attributes.
  footwearId=int
  footwearName=String
  footwearType=String
  price =int

the above attributes should be private.
write getter and setter and parametrised constructor as required.

create the class footwearProgrammm with the main method.
implement the 2 static methods.getCountByType and
getSecondHighestPriceByBrand in the Solution class.


getCountByType method:
   this method will take two input parameters.
array of the Footwear objects and string parameter footwear type.
this method will return the count of the footwears from array of the
footwear objects for the given type of footwear.
if no footwear with the given footwear type is found in the
array of footwear abjects,then the method should return 0.



getSecondHighestPriceByBrand method:
  this method will take 2 input parameters-array of footwear objects and string parameter inputFootwearName.the method
will return the second highest footwear objects based on the price from the array of the Footwear objects


whose brand name matches with the input string parameter.


if no footwear with the given brand is present in the array of the footwear objects,the the method
should return null.

NOTE: no two footwear objects would have the same footwearId.All the searches should be case insensitive.
the above mentioned static methods should be called from the main method.

for getCountByType method- the main method should print the count of the footwears ,if the returned value
is greater than zero. or it should print "Footwear not available";

for getSecondHighestPriceByBrand method-The main method should print price from the returned footwear objects


if the returned footwear object is not null.else it should print "Brand not available".
for example.
112
ABC
25555
  where 112 is the footwear id,ABC is brand name,25555 is price.

consider the sample input and output.
100
Sketchers
sneekers
12345
103
Puma
running shoes
10099
102
reebok
Running shoes
5667
101
Reebok
running shoes
5656
99
reebok
floaters
5666
Running shoes
reebok

Sample output:
3
99
reebok
5666

Sample input2:

100
Puma
sneekers
12345
101
Puma
sneekers
10099
102
Puma
sneekers
5000
102
Reebok
sneekers
8000
104
Puma
floaters
2000
running shoes
bata

Sample output:
Footwear not available
Brand not available
 */

import java.util.*;
class Footwear
{
    private int footwearId;
    private String footwearName;
    private String footwearType;
    private int price;

    public int getFootwearId()
    {
        return footwearId;
    }
    public void setFootwearId(int footwearId)
    {
        this.footwearId=footwearId;
    }
    public String getFootwearName()
    {
        return footwearName;
    }
    public void setFootwearName(String footwearName)
    {
        this.footwearName=footwearName;
    }
    public String getFootwearType()
    {
        return footwearType;
    }
    public void setFootwearType(String footwearType)
    {
        this.footwearType=footwearType;
    }
    public int getPrice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price=price;
    }
    public Footwear(int footwearId,String footwearName,String footwearType,int price)
    {
        this.footwearId=footwearId;
        this.footwearName=footwearName;
        this.footwearType=footwearType;
        this.price=price;
    }
}
public class footwear_solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Footwear[] arr=new Footwear[5];
        for(int i=0;i<5;i++)
        {
            int a=sc.nextInt(); sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            int d=sc.nextInt(); sc.nextLine();

            arr[i]=new Footwear(a,b,c,d);
        }
        String footwearType=sc.nextLine();
        String footwearName=sc.nextLine();
        int res=getCountByType(arr,footwearType);
        if(res!=0)
        {
            System.out.println(res);
        }
        else
        {
            System.out.println("Footwear not available");
        }
        Footwear res2=getSecondHighestPriceByBrand(arr,footwearName);
        if(res2!=null)
        {
            System.out.println(res2.getFootwearId());
            System.out.println(res2.getFootwearName());
            System.out.println(res2.getPrice());
        }
        else
        {
            System.out.println("Brand not available");
        }
        sc.close();
    }
    public static int getCountByType(Footwear[] arr,String footwearType)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].getFootwearType().equalsIgnoreCase(footwearType))
            {
                count++;
            }
        }
        if(count>0)
        {
            return count;
        }
        else
        {
            return 0;
        }
    }
    public static Footwear getSecondHighestPriceByBrand(Footwear[] arr,String footwearName)
    {
        Footwear[] arr2=new Footwear[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].getFootwearName().equalsIgnoreCase(footwearName))
            {
                arr2=Arrays.copyOf(arr2,arr2.length+1);
                arr2[arr2.length-1]=arr[i];
            }
        }
        for(int i=0;i<arr2.length-1;i++)
        {
            for(int j=i+1;j<arr2.length;j++)
            {
                if(arr2[i].getPrice()<arr2[i].getPrice())
                {
                    Footwear temp=arr2[i];
                    arr2[i]=arr2[j];
                    arr2[j]=temp;
                }
            }
        }
        if(arr2.length>0)
        {
            return arr[1];
        }
        else
        {
            return null;
        }
    }
}
