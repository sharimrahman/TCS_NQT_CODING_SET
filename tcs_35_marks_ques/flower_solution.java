/* 
 *  Create the class Flowers with below attribute:

flowerId-int;
flowerName-String;
price-int;
rating-int;
type-String;

The above attributes must be private,write getters and setters and parametrized constructor as well.

Create class MyClass with main method.

Implement one static method:findMinPriceByType in MyClass class.

findMinPriceByType Method:

This method will take two input parameters:Array of Flower objects and String parameter.This method will return the minimum 
priced flower object from  array of Flower objects for the given type(String parameter),only if the rating is greater than 
3. If no Flowers with the above conditions are present in the array of the flower objects,then the method will return null.

For this method-The main method  should print the flowerId from the returned object if the returned value is not null.
else it should print "There is no flower with given type".

**********************************************************************

input1:

123
Yellow trout lilly
3000
5
ephemerals
345
snowdrop
2500
4
ephemerals
321
Yarrow
1000
4
perennials
213
red trillium
2250
4
ephemerals
ephemerals

output:
213





**********************

input2:

123
Yellow trout lilly
3000
5
ephemerals
345
snowdrop
2500
4
ephemerals
321
Yarrow
1000
4
perennials
213
red trillium
2250
4
ephemerals
Biennial


output2:

There is no flower with given type.
*/

import java.util.*;
class Flower
{
    private int flowerId;
    private String flowerName;
    private int price;
    private int rating;
    private String type;

    public int getFlowerId()
    {
        return flowerId;
    }
    public void setFlowerId(int flowerId)
    {
        this.flowerId=flowerId;
    }
    public String getFlowerName()
    {
        return flowerName;
    }
    public void setFlowerName(String flowerName)
    {
        this.flowerName=flowerName;
    }
    public int getPrice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price=price;
    }
    public int getRating()
    {
        return rating;
    }
    public void setRating(int rating)
    {
        this.rating=rating;
    }
    public String getType()
    {
        return type;
    }
    public void setType(String type)
    {
        this.type=type;
    }

    public Flower(int flowerId,String flowerName,int price,int rating,String type)
    {
        this.flowerId=flowerId;
        this.flowerName=flowerName;
        this.price=price;
        this.rating=rating;
        this.type=type;
    }

}
public class flower_solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Flower[] arr=new Flower[4];
        for(int i=0;i<4;i++)
        {
            int a=sc.nextInt(); sc.nextLine();
            String b=sc.nextLine();
            int c=sc.nextInt(); sc.nextLine();
            int d=sc.nextInt(); sc.nextLine();
            String e=sc.nextLine();

            arr[i]=new Flower(a,b,c,d,e);
        }
        String type=sc.nextLine();
        Flower res=findMinPriceByType(arr,type);
        if(res!=null)
        {
            System.out.println(res.getFlowerId());
        }
        else
        {
            System.out.println("There is no flower with given type");
        }
        sc.close();
    }
    public static Flower findMinPriceByType(Flower[] arr,String type)
    {
        Flower[] arr2=new Flower[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].getRating()>3  && arr[i].getType().equalsIgnoreCase(type))
            {
                arr2=Arrays.copyOf(arr2,arr2.length+1);
                arr2[arr2.length-1]=arr[i];
            }
        }
        for(int i=0; i<arr2.length-1;i++)
        {
            for(int j=i+1;j<arr2.length;j++)
            {
                if(arr2[i].getPrice()>arr2[j].getPrice())
                {
                    Flower temp=arr2[i];
                    arr2[i]=arr2[j];
                    arr2[j]=temp;
                }
            }
        }
        if(arr2.length>0)
        {
            return arr2[0];
        }
        else
        {
            return null;
        }
    }
}
