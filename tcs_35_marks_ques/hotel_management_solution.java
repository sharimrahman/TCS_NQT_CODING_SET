/*
CREATE A CLASS HOTEL WITH BELOW ATTRIBUTE
HOTEL-ID - INT
HOTEL-NAME - STRING
HOTEL-CABFACILITY - STRING
HOTEL-RATING - INT
HOTEL-FEES - INT 
WRITE GETTER , SETTER AND PARAMETERISED CONSTRUTOR AS REQUIRED .
CREATE A CLASS SOLUTION AND WRITE MAIN METHOD IN IT INSIDE MAIN MAIN METHOD WRITE 1. STATIC METHOD-- { hotelByHighestRating }
1. hotelByHighestRating  -- in this method two input are taken one is array of HOTEL objects and second is string input which is cabficility of HOTEL
if rating is greater than 5 and cabfacuility is availble then output the highest rating if it is not greater than 5 then it should return 0 ;
condition 1 --> if hotel rating below 5 then it should be zero so print ----> "NO HOTEL WITH GIVEN FACILITY"
condition 2 --> if hoteL rating greater than 5 and CABFACILITY is yes then print hotel rating 
Take 4 HOTEL objects as input and one String cabfacility 
INPUT 1.
101
TAJ
YES
7
70000
102
RAJ
NO
5
30000
103
J&J
NO
6
40000
104
ITC
YES 
5
50000
YES
OUTPUT 1 .
7
INPUT 2.
101
TAJ
YES
5
70000
102
RAJ
NO
5
30000
103
J&J
NO
6
40000
104
ITC
YES 
5
50000
YES
OUTPUT 2.
NO HOTEL WITH GIVEN FACILITY
*/

import java.util.*;
class Hotel
{
    private int hotelId;
    private String hotelName;
    private String hotelCabFacility;
    private int hotelRating;
    private int hotelFees;

    public int getHotelId()
    {
        return hotelId;
    }
    public void setHotelId(int hotelId)
    {
        this.hotelId=hotelId;
    }
    public String gethotelName()
    {
        return hotelName;
    }
    public void setHotelName(String hotelName)
    {
        this.hotelName=hotelName;
    }
    public String getHotelCabFacility()
    {
        return hotelCabFacility;
    }
    public void setHotelCabFacility(String hotelCabFacility)
    {
        this.hotelCabFacility=hotelCabFacility;
    }
    public int getHotelRating()
    {
        return hotelRating;
    }
    public void setHotelRating(int hotelRating)
    {
        this.hotelRating=hotelRating;
    }
    public int getHotelFees()
    {
        return hotelFees;
    }
    public void setHotelFees(int hotelFees)
    {
        this.hotelFees=hotelFees;
    }
    public Hotel(int hotelId, String hotelName, String hotelCabFacility, int hotelRating, int hotelFees)
    {
        this.hotelId=hotelId;
        this.hotelName=hotelName;
        this.hotelCabFacility=hotelCabFacility;
        this.hotelRating=hotelRating;
        this.hotelFees=hotelFees;
    }
}
public class hotel_management_solution
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        Hotel[] arr=new Hotel[4];
        for(int i=0;i<4;i++)
        {
            int a=sc.nextInt(); sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            int d=sc.nextInt(); sc.nextLine();
            int e=sc.nextInt(); sc.nextLine();

            arr[i]=new Hotel(a,b,c,d,e);
        }
        String cabFacility=sc.nextLine();
        int res=hotelByHighestRating(arr,cabFacility);
        if(res!=0)
        {
            System.out.println(res);
        }
        else
        {
            System.out.println("NO HOTEL WITH GIVEN FACILITY");
        }
        sc.close();
    }   
    public static int hotelByHighestRating(Hotel[] arr,String cabFacility)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].getHotelRating()>5 && arr[i].getHotelCabFacility().equalsIgnoreCase(cabFacility))
            {
                return arr[i].getHotelRating();
            }
        }
        return 0;
    }
}
