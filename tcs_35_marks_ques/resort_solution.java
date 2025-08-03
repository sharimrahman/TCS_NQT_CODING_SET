/*
 * Create a class Resort with the below attributes:
resortld- int resortName - String category - String price- double rating - double
The above attributes should be private, write getters, setters and parameterized constructor as required.
Create class Solution with main method.
Implement a static method - findAvgPriceByCategory in Solution class.
findAvgPriceByCategory method:
This method will take two input parameters - array of Resort objects and String parameter.
The method will return the average price of Resort(as int value) from array of Resort objects for the given category(String parameter passed) and whose rating is greater than 4.
If no Resort with the above condition is present in the array of Resort objects, then the method should return 0.
Note: All the searches should be case insensitive.
The above mentioned static method should be called from the main method.

For findAvgPriceByCategory method - The main method should print the returned average price of Resort as it is, if the returned value is greater than 0 otherwise it should print "There are no such available resort"
Eg: Average price of the 3 Star Resort: 9250
where 9250 is the average price and 3 Star is the category.

Before calling these static methods in main, use Scanner object to read the values of four Resort objects referring attributes in the above mentioned attribute sequence.
Next, read one String value for capturing category input.
Consider below sample input and output:
Testcase1:
Input:
1005
Samudra
3 star
3500.00
3.5
1001
O by Tamara
5 Star
7500.00
4
1007
Edens resort
3 Star
2500.00
4.7
1003
Tea Valley
3 Star
4600.00
4.3
3 Star
be circula

Output:
Average price of the 3 Star Resort: 3550

 */

import java.util.*;
class Resort
{
    private int resortId;
    private String resortName;
    private String category;
    private double price;
    private double rating;

    public int getResortId()
    {
        return resortId;
    }
    public void setResortId(int resortId)
    {
        this.resortId=resortId;
    }
    public String getResortName()
    {
        return resortName;
    }
    public void setResortName(String resortName)
    {
        this.resortName=resortName;
    }
    public String getCategory()
    {
        return category;
    }
    public void setCategory(String category)
    {
        this.category=category;
    }
    public double getPrice()
    {
        return price;
    }
    public void setPrice(double price)
    {
        this.price=price;
    }
    public double getRating()
    {
        return rating;
    }
    public void setRating(double rating)
    {
        this.rating=rating;
    }
    public Resort(int resortId,String resortName,String category,double price,double rating)
    {
        this.resortId=resortId;
        this.resortName=resortName;
        this.category=category;
        this.price=price;
        this.rating=rating;
    }
}
public class resort_solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Resort[] arr=new Resort[4];
        for(int i=0;i<4;i++)
        {
            int a=sc.nextInt(); sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            double d=sc.nextDouble(); sc.nextLine();
            double e=sc.nextDouble(); sc.nextLine();
            arr[i]=new Resort(a,b,c,d,e);
        }
        String category=sc.nextLine();
        double avg=findAvgPriceByCategory(arr,category);
        if(avg>0)
        {
            System.out.println("Average price of the "+category+" Resort:"+avg);
        }
        else
        {
            System.out.println("There are no such available resort");
        }
        sc.close();
    }
    public static double findAvgPriceByCategory(Resort[] arr,String category)
    {
        int count=0;
        double sum=0.0,avg=0.0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].getCategory().equals(category) && arr[i].getRating()>4)
            {
                sum=sum+arr[i].getPrice();
                count++;
            }
        }
        avg=sum/count;
        if(avg>0)
        {
            return avg;
        }
        else
        {
            return 0;
        }
    }
}