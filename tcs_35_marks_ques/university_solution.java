/*
 * WRITE A CLASS UNIVERSITY WITH SOME CLASS ATTRIBUTES SHOULD BE PRIVATE
INT ID;
STRING NAME;
STRING LOCATION;
BOOLEAN AVAILABLITY;
DOUBLE RATING;
INT FEES
WRITE A GETTER AND SETTER FOR THE SAME ATTRIBUTES ALSO CONSTRUCT THE CONSTRUTER
IMPLEMENT METHOD
getCollege--> THIS METHOD TAKE 3 INPUTS FIRST ARRAY OF UNIVERSITIES THEN ONE STRING PARAMETER ( WHICH IS LOCATION) AND ANOTHER
INT PARAMETER( WHICH IS RATING) THIS MEHTOD SHOULD RETURN THE LEAST FEES OF UNIVERSITY WHICH IS AVAILABLE AND IF NO UNIVERSITY FOUND PRINT "NO SUCH UNIVERSITY"
TAKE ARRAY INPUT FOR 4 OBJECTS ALSO TAKE 1 INPUT FOR STRING PARA AND FOR DOUBLE RAING

101
RGPV
BHOPAL
true
3
60000
102
DU
DELHI 
false
5
120000
103
CENTAL
DELHI
false
5
150000
104
VIT
VELLORE
false
5
220000
DELHI
4

OUTPUT
NO SUCH UNIVERSITY
 */

import java.util.*;
class University
{
    private int id;
    private String name;
    private String location;
    private boolean availability;
    private double rating;
    private int fees;
    
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getLocation()
    {
        return location;
    }
    public void setLocation(String location)
    {
        this.location=location;
    }
    public boolean getAvailability()
    {
        return availability;
    }
    public void setAvailability(boolean availability)
    {
        this.availability=availability;
    }
    public double getRating()
    {
        return rating;
    }
    public void setRating(double rating)
    {
        this.rating=rating;
    }
    public int getFees()
    {
        return fees;
    }
    public void setFees(int fees)
    {
        this.fees=fees;
    }

    public University(int id, String name, String location, boolean availability, double rating, int fees)
    {
        this.id=id;
        this.name=name;
        this.location=location;
        this.availability=availability;
        this.rating=rating;
        this.fees=fees;
    }
}
public class university_solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        University[] arr=new University[4];
        for(int i=0;i<4;i++)
        {
            int a=sc.nextInt(); sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            boolean d=sc.nextBoolean(); sc.nextLine();
            double e=sc.nextDouble();
            int f=sc.nextInt(); sc.nextLine();

            arr[i]=new University(a,b,c,d,e,f);
        }
        String location=sc.nextLine();
        int rating=sc.nextInt(); sc.nextLine();
        int res=getCollege(arr,location,rating);
        if(res!=Integer.MAX_VALUE)
        {
            System.out.println(res);
        }
        else
        {
            System.out.println("NO SUCH UNIVERSITY");
        }
        sc.close();
    }
    public static int getCollege(University[] arr, String location, int rating)
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].getLocation().equalsIgnoreCase(location) && arr[i].getRating()>=rating && arr[i].getAvailability()==true)
            {
                if(arr[i].getFees()<min)
                {
                    min=arr[i].getFees();
                }
            }
        }
        return min;
    }
}
