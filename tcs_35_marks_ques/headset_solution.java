/*
 * Create a class HeadSets with below attributes:
headsetName - String
brand-String 
price - int
available- boolean

The above attributes should be private, write getters, setters and parameterized constructor as required.

Create class Solution with main method.

Implement two static methods - findTotalPriceForGivenBrand and findAvailableHeadsetWithSecondMinPrice in Solution class.

findTotalPriceForGivenBrand method:
The method will return the total price of Headsets from array of Headset objects for the given brand(String parameter passed).
If no Headsets with the given brand is present in the array of Headsets objects, then the method should return 0.

findAvailableHeadsetWithSecondMinPrice method:
This method will take array of Headset objects as an input parameter and returns the
available Headset object with the second lowest/minimum price from the given array of
objects.
If no Headsets with the above contition is present in the array of Headsets objects, then the method should return null.
Note: No two Headsets will have the same price.
All the searches should be case insensitive.
The above mentioned static methods should be called from the main method.

For findTotalPriceForGivenBrand method - The main method should print the returned total price as it is if the returned value is greater than 0 or it should print "No Headsets available with the given brand".
Eg: 4500
where 4500 is the total Headsets price
For findAvailableHeadsetWithSecondMinPrice method - The main method should print the headsetsName and price from the returned Headsets object if the returned value is not null.
If the returned value is null then it should print "No Headsets available".
Eg:Logitech Wired
1500
where Logitech Wired is the headsetName and 1500 is the price
Before calling these static methods in main, use Scanner object to read the values of four Headset objects referring attributes in the above mentioned attribute sequence.
Next, read the value of String parameter for capturing brand.

Consider below sample input and output:
Input1:
boAt BassHeads
boAt
1220
true
Over Ear Wired
boAt
549
true
In Ear with Mic
JBL
450
true
Buds 2 Neo
RealMe
500
true
boAt
Output:
1769
Buds 2 Neo
500
 */

import java.util.*;
class Headsets
{
    private String headsetName;
    private String brand;
    private int price;
    private boolean available;

    public String getHeadsetName()
    {
        return headsetName;
    }
    public void setHeadsetName(String headsetName)
    {
        this.headsetName=headsetName;
    }
    public String getBrand()
    {
        return brand;
    }
    public void setBrand(String brand)
    {
        this.brand=brand;
    }
    public int getPrice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price=price;
    }
    public boolean getAvailable()
    {
        return available;
    }
    public void setAvailable(boolean available)
    {
        this.available=available;
    }

    public Headsets(String headsetName,String brand,int price,boolean available)
    {
        this.headsetName=headsetName;
        this.brand=brand;
        this.price=price;
        this.available=available;
    }
} 
public class headset_solution
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    Headsets[] arr=new Headsets[4];
    for(int i=0;i<4;i++)
    {
        String a=sc.nextLine();
        String b=sc.nextLine();
        int c=sc.nextInt(); sc.nextLine();
        boolean d=sc.nextBoolean(); sc.nextLine();
        arr[i]=new Headsets(a,b,c,d);
    }
    String brand=sc.nextLine();
    int sum=findTotalPriceForGivenBrand(arr,brand);
    if(sum>0)
    {
        System.out.println(sum);
    }
    else
    {
        System.out.println("No Headsets available with the given brand");
    }
    Headsets res=findAvailableHeadsetWithSecondMinPrice(arr);
    if(res!=null)
    {
        System.out.println(res.getHeadsetName());
        System.out.println(res.getPrice());
    }
    else
    {
        System.out.println("No Headsets available");
    }
    sc.close();
    }
    public static int findTotalPriceForGivenBrand(Headsets[] arr,String brand)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].getBrand().equals(brand))
            {
                sum+=arr[i].getPrice();
            }
        }
        if(sum>0)
        {
            return sum;
        }
        else
        {
            return 0;
        }
    }
    public static Headsets findAvailableHeadsetWithSecondMinPrice(Headsets[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i].getPrice()>arr[j].getPrice())
                {
                    Headsets temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        if(arr[1].getAvailable()==true)
        {
            return arr[1];
        }
        else 
        {
            return null;
        }
    }
}