/*
 * Create a class Hotel_2 with the below attributes:
hotelld - int 
hotelName-String 
dateOfBooking- String (in the format dd-mon-yyyy)
noOfRoomsBooked - int 
wifiFacility-String 
totalBill- double
The above attributes should be private, write getters, setters and parameterized constructor as required.
Create class Solution with main method.
Implement two static methods - noOfRoomsBookedInGivenMonth and searchHotelByWifiOption in Solution class.
noOfRoomsBookedInGivenMonth method
This method will take two input parameter - array of Hotel objects and a String parameter
The method will return the total numbers of rooms booked from array of Hotel objects for the given month(String
parameter passed).
If no rooms are booked for the given month in the array of Hotel objects,
then the method should return 0.
searchHotelByWifioption method:
This method will take two input parameter - array of Hotel objects and a String parameter
The method will return Hotel object with second highest totalbill.
from the array of Hotel objects where wifiFacility attribute matches with the given wifi facility 
(String parameter If no Hotel with the given wifi option is present in the array of Hotel objects, 
then the method should return null)

Note: No two Hotel object would have the same hotelld.
No two Hotel object would have the same totalbill The Array either has at least two objects with specified wifi option
OR no object with specified wifi option All the searches should be case insensitive. dateOfBooking is, stored in the format dd-mon-year (e.g. 01-jan-2022)
The
above mentioned static methods should be called main method.

For searchHotelByWifiOption method - The main method should print the hotelld from
the returned Hotel object if the returned value
is not null. If the returned available". is null then it should print "No such option available"
Before calling these static methods in main, use Scanner object to read the values of four Hotel objects referring above mentioned attribute sequence. Next, read the value of two String parameters for capturing the month and wifi option.
consider below sample Input and outputs.

Input 1:
101
Best Stay
01-jan-2022
10
Yes
20000
102
Apple Stay
12-Feb-2022
3
yes
4000
103
Accord
11-May-2022
5
yes
15000
104
Royal Park
22-Dec-2021
7
yes
12000
May
Yes

Output
5
103
 */

import java.util.*;
class Hotel_2
{
    private int hotelId; 
    private String hotelName; 
    private String dateOfBooking;
    private int noOfRoomsBooked;
    private String wifiFacility;
    private double totalBill;

    public int getHotelId()
    {
        return hotelId;
    }
    public void setHotelId(int hotelId)
    {
        this.hotelId=hotelId;
    }
    public String getHotelName()
    {
        return hotelName;
    }
    public void setHotelName(String hotelName)
    {
        this.hotelName=hotelName;
    }
    public String getDateOfBooking()
    {
        return dateOfBooking;
    }
    public void setDateOfBooking(String dateOfBooking)
    {
        this.dateOfBooking=dateOfBooking;
    }
    public int getNoOfRoomsBooked()
    {
        return noOfRoomsBooked;
    }
    public void setNoOfRoomsBooked(int noOfRoomsBooked)
    {
        this.noOfRoomsBooked=noOfRoomsBooked;
    }
    public String getWifiFacility()
    {
        return wifiFacility;
    }
    public void setWifiFacility(String wifiFacility)
    {
        this.wifiFacility=wifiFacility;
    }
    public double getTotalBill()
    {
        return totalBill;
    }
    public void setTotalBill(double totalBill)
    {
        this.totalBill=totalBill;
    }
    public Hotel_2(int hotelId,String hotelName,String dateOfBooking,int noOfRoomsBooked,String wifiFacility,double totalBill)
    {
        this.hotelId=hotelId;
        this.hotelName=hotelName;
        this.dateOfBooking=dateOfBooking;
        this.noOfRoomsBooked=noOfRoomsBooked;
        this.wifiFacility=wifiFacility;
        this.totalBill=totalBill;
    }
}
public class hotel_2_solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Hotel_2[] arr=new Hotel_2[4];
        for(int i=0;i<4;i++)
        {
            int a=sc.nextInt(); sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            int d=sc.nextInt(); sc.nextLine();
            String e=sc.nextLine();
            double f=sc.nextDouble(); sc.nextLine();

            arr[i]=new Hotel_2(a,b,c,d,e,f);
        }
        String month=sc.nextLine();
        String wifiFacility=sc.nextLine();
        int sum=noOfRoomsBookedInGivenMonth(arr,month);
        if(sum!=0)
        {
            System.out.println(sum);
        }
        else
        {
            System.out.println("No rooms booked in the given month");
        }
        Hotel_2 res=searchHotelByWifioption(arr,wifiFacility);
        if(res!=null)
        {
            System.out.println(res.getHotelId());
        }
        else
        {
            System.out.println("No such option available");
        }
        sc.close();
    }
    public static int noOfRoomsBookedInGivenMonth(Hotel_2[] arr,String month)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            String str=arr[i].getDateOfBooking();
            String s=str.substring(3,6);
            if(s.equalsIgnoreCase(month))
            {
                sum=sum+arr[i].getNoOfRoomsBooked();
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
    public static Hotel_2 searchHotelByWifioption(Hotel_2[] arr,String wifiFacility)
    {
        Hotel_2[] arr2=new Hotel_2[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].getWifiFacility().equalsIgnoreCase(wifiFacility))
            {
                arr2=Arrays.copyOf(arr2,arr2.length+1);
                arr2[arr2.length-1]=arr[i];
            }
        }
        for(int i=0;i<arr2.length-1;i++)
        {
            for(int j=i+1;j<arr2.length;j++)
            {
                if(arr2[i].getTotalBill()<arr2[j].getTotalBill())
                {
                    Hotel_2 temp=arr2[i];
                    arr2[i]=arr2[j];
                    arr2[j]=temp;
                }
            }
        }
        if(arr2.length>0)
        {
            return arr2[1];
        }
        else
        {
            return null;
        }   
    }
}
