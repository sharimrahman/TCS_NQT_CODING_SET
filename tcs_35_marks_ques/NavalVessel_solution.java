/*
 * Create a class NavalVessel with the below attributes:

vesselld – int
vesselName – String
noOfVoyagesPlanned – int
noOfVoyagesCompleted – int
purpose – String


Write getters, setters for the above attributes. Create constructor which takes parameter in the above 
sequence except classification.

Create class Solution with main method. Implement two static methods – findAvgVoyagesByPct and findVesselByGrade 
in Solution class.

findAvgVoyagesByPct method:

This method will take two input parameters -array of NavalVessel objects and int parameter percentage. The method will 
return the average of the noOfVoyagesCompleted attribute from NavalVessel objects which meets the percentage requirement 
as mentioned below.The percentage for each navalVessel is calculated as 
percentage .(noOfVoyagesCompleted * 100)/noOfVoyagesPlanned. If the above calculated percentage is greater than or equal 
to the percentage passed as the parameter, then those objects should participate in the average calculation. If there are 
no objects with the mentioned criteria, then the method should return 0.

findVesselByGrade method:

This method will take a String parameter purpose, along with the array of NavalVessel objects. The method will return the 
NavalVessel object, if the input String parameter matches with the purpose attribute of the NavalVessel object. Before 
returning the object, the classification should be derived as mentioned below. This classification value should be assigned 
to the object before returning. If any of the above conditions are not met, then the method should return null. The 
classification attribute should be calculated based on the percentage calculation mentioned above. 
If the percentage = 100 then classification should be ‘Star’, if percentage is between 99 and 80 then classification should 
be ‘Leader, if percentage is between 79 and 55 then classification should be ‘Inspirer' otherwise the classification should 
be ‘Striver’ If the returned value is null then it should print “No Naval Vessel is available with the specified purpose”.

Before calling these static methods in main, use Scanner object to read the values of four NavalVessel objects referring 
attributes in the above mentioned attribute sequence (except the classification attribute). Next, read the value for 
percentage and purpose.

Input
-------------------
111
Rojer
100
100
Passenger
222
Kalam
200
100
Goods
333
Yashwin
400
300
Army
444
Thanishwini
500
500
Welfare
75
Army

Output
------------------
300
Yashwin%Inspirer
 */

import java.util.*;
class NassalVessel
{
    private int vesselId;
    private String vesselName;
    private int noOfVoyagesPlanned;
    private int noOfVoyagesCompleted;
    private String purpose;

    public int getVesselId()
    {
        return vesselId;
    }
    public void setVesselId(int vesselId)
    {
        this.vesselId=vesselId;
    }
    public String getVesselName()
    {
        return vesselName;
    }
    public void setVesselName(String vesselName)
    {
        this.vesselName=vesselName;
    }
    public int getNoOfVoyagesPlanned()
    {
        return noOfVoyagesPlanned;
    }
    public void setNoOfVoyagesPlanned(int noOfVoyagesPlanned)
    {
        this.noOfVoyagesPlanned=noOfVoyagesPlanned;
    }
    public int getNoOfVoyagesCompleted()
    {
        return noOfVoyagesCompleted;
    }
    public void setNoOfVoyagesCompleted(int noOfVoyagesCompleted)
    {
        this.noOfVoyagesCompleted=noOfVoyagesCompleted;
    }
    public String getPurpose()
    {
        return purpose;
    }
    public void setPurpose(String purpose)
    {
        this.purpose=purpose;
    }
    public NassalVessel(int vesselId, String vesselName, int noOfVoyagesPlanned, int noOfVoyagesCompleted, String purpose)
    {
        this.vesselId=vesselId;
        this.vesselName=vesselName;
        this.noOfVoyagesPlanned=noOfVoyagesPlanned;
        this.noOfVoyagesCompleted=noOfVoyagesCompleted;
        this.purpose=purpose;
    }
}
public class NavalVessel_solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        NassalVessel[] arr=new NassalVessel[4];
        for(int i=0;i<4;i++)
        {
            int a=sc.nextInt(); sc.nextLine();
            String b=sc.nextLine();
            int c=sc.nextInt(); sc.nextLine();
            int d=sc.nextInt(); sc.nextLine();
            String e=sc.nextLine();

            arr[i]=new NassalVessel(a,b,c,d,e);
        }
        int percentage=sc.nextInt(); sc.nextLine();
        String purpose=sc.nextLine();
        int avg=findAvgVoyagesByPct(arr,percentage);
        if(avg!=0)
        {
            System.out.println(avg);
        }
        NassalVessel res=findVesselByGrade(arr,purpose);
        if(res!=null)
        {
            if(res.getNoOfVoyagesCompleted()*100/res.getNoOfVoyagesPlanned()==100)
            {
                System.out.println(res.getVesselName()+"%"+"Star");
            }
            else if(res.getNoOfVoyagesCompleted()*100/res.getNoOfVoyagesPlanned()>=80 && res.getNoOfVoyagesCompleted()*100/res.getNoOfVoyagesPlanned()<100)
            {
                System.out.println(res.getVesselName()+"%"+"Leader");
            }
            else if(res.getNoOfVoyagesCompleted()*100/res.getNoOfVoyagesPlanned()>=55 && res.getNoOfVoyagesCompleted()*100/res.getNoOfVoyagesPlanned()<80)
            {
                System.out.println(res.getVesselName()+"%"+"Inspirer");
            }
            else
            {
                System.out.println(res.getVesselName()+"%"+"Striver");
            }
        }
        sc.close();
    }
    public static int findAvgVoyagesByPct(NassalVessel[] arr,int percentage)
    {
        int sum=0,count=0,avg;
        for(int i=0;i<arr.length;i++)
        {
            if((arr[i].getNoOfVoyagesCompleted()*100)/arr[i].getNoOfVoyagesPlanned()>=percentage)
            {
                sum=sum+arr[i].getNoOfVoyagesCompleted();
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
    public static NassalVessel findVesselByGrade(NassalVessel[] arr, String purpose)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].getPurpose().equalsIgnoreCase(purpose))
            {
                return arr[i];
            }
        }
        return null;
    }
}
