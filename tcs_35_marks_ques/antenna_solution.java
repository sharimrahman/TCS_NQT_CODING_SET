/*
 * create a class Antenna with below attributes.
antennaid=int
antennaName=String
projectLead=String
antennaVSWR=double

the above attribute should be private ,write getter and setter and parametrized constructor as well.

create class MyClass with main method.
implement two static methods searchAntennaByName and sortAntennaByVSWR in MyClass class.


searchAntennaByName :
  This method will take an array of Antenna objects and the
string value as input parameter.The method will find out Antenna name(String parameter
passed) .it will return Antennaid if found.if there is no Antenna that matches then the
method will return zero.
the main method should print the antennaid,if the returned value is not 0.if the
returned value is 0 then print,"There is no antenna with the given parameter".


sortAntennaByVSWR:
This method will take an array of Antenna Objects and a double value as input.
this method will return an array of Antenna objects sorted in ascending orderof their


antennaVSWR. which is less than VSWR(double value passed)       

  the main method should print name of the project leads from the returned array
if the returned value is not null.if the returned value is null then main method should
print "No Antenna found";


input1:

111
Reconfigurable
Hema
0.4
222
Wearable
Kavya
0.9
333
Microstrip
Teju
0.3
444
Dielectric
Sai
0.65
Microstrip
0.5

output:
333
Teju
Hema


input 2:
111
Reconfigurable
Hema
0.3
222
Wearable
Kavya
0.9
333
Microstrip
Teju
0.4
444
Dielectric
Sai
0.65
Resonator
0.25

output:
There is no antenna with given parameter
No Antenna found
 */

import java.util.*;
class Antenna
{
    private int antennaId;
    private String antennaName;
    private String projectLead;
    private double antennaVSWR;

    public int getAntennaId()
    {
        return antennaId;
    }
    public void setAntennaId(int antennaId)
    {
        this.antennaId=antennaId;
    }
    public String getAntennaName()
    {
        return antennaName;
    }
    public void setAntennaName(String antennaName)
    {
        this.antennaName=antennaName;
    }
    public String getProjectLead()
    {
        return projectLead;
    }
    public void setProjectLead(String projectLead)
    {
        this.projectLead=projectLead;
    }
    public double getAntennaVSWR()
    {
        return antennaVSWR;
    }
    public void setAntennaVSWR(double antennaVSWR)
    {
        this.antennaVSWR=antennaVSWR;
    }

    public Antenna(int antennaId,String antennaName, String projectLead,double antennaVSWR)
    {
        this.antennaId=antennaId;
        this.antennaName=antennaName;
        this.projectLead=projectLead;
        this.antennaVSWR=antennaVSWR;
    }
}
public class antenna_solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Antenna[] arr=new Antenna[4];
        for(int i=0;i<4;i++)
        {
            int a=sc.nextInt(); sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            double d=sc.nextDouble(); sc.nextLine();

            arr[i]=new Antenna(a,b,c,d);
        }
        String antennaName=sc.nextLine();
        double antennaVSWR=sc.nextDouble(); sc.nextLine();
        int res=searchAntennaByName(arr, antennaName);
        if(res!=0)
        {
            System.out.println(res);
        }
        else
        {
            System.out.println("There is no antenna with the given parameter");
        }
        Antenna[] res2=sortAntennaByVSWR(arr,antennaVSWR);
        if(res2!=null)
        {
            for(int i=0;i<res2.length;i++)
            {
                System.out.println(res2[i].getProjectLead());
            }
        }
        else
        {
            System.out.println("No Antenna found");
        }
        sc.close();
    }
    public static int searchAntennaByName(Antenna[] arr,String antennaName)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].getAntennaName().equalsIgnoreCase(antennaName))
            {
                return arr[i].getAntennaId();
            }
        }
        return 0;
    }
    public static Antenna[] sortAntennaByVSWR(Antenna[] arr,double antennaVSWR)
    {
        Antenna[] arr2=new Antenna[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].getAntennaVSWR()<antennaVSWR)
            {
                arr2=Arrays.copyOf(arr2,arr2.length+1);
                arr2[arr2.length-1]=arr[i];
            }
        }
        for(int i=0;i<arr2.length-1;i++)
        {
            for(int j=i+1;j<arr2.length;j++)
            {
                if(arr2[i].getAntennaVSWR()>arr2[j].getAntennaVSWR())
                {
                    Antenna temp=arr2[i];
                    arr2[i]=arr2[j];
                    arr2[j]=temp;
                }
            }
        }
        if(arr2.length>0)
        {
            return arr2;
        }
        else
        {
            return null;
        }
    }
}
