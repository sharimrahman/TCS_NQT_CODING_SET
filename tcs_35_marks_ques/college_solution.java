/*
 * Create a class College with the below attributes.

 id-int 

 name -String 

 contactNo-int

 address-String 

 pinCode-int



Write the getters and setters and parametrized constructor in the above 

mentioned sequence as required.



Create the class Solution with the main method.

Implement the two static methods:

 1.findCollegeWithMaximumPincode 

 2.searchCollegeByAddress



findCollegeWithMaximumPincode method:

   Create the Static method in the Solution Class.

 This method will take array of the College objects and return the 

College object having maximum pincode if found else return null if not 

found.

   for this method ,main method will print College object with maximum

pincode if the returned value is not null.if the returned value is null ,


then the main method will print "No college found with mentioned attribute".





searchCollegeByAddress method:

   Create the Static method in the Solution Class.

This method will take array of College objects as input and address as 

input and return College object having the mentioned address if found 

else return null if not found.

   for this method main method will print College object details as it is ,

 if the returned value is not null.if the returned value is null then ,


main method will print "No college found with mentioned attribute".




***************************************************************************

input 1:

109 
ACT
2500256
mumbai
695001
107
MCE
2500254
malapuram
612354
113
CTE
2500252
chennai
623145
102
SCT
2500255
AP
523641
AP

OUTPUT1:

id-109
name-ACT
contactNo-2500256
address-mumbai
pincode-695001
id-102
name-SCT
contactNo-2500255
address-AP
pincode-523641

INPUT2:

111
MJT
2500251
Calicut
401235
105
MET
2500256
kochi
668745
115
IIT
2500262
banglore
569874
110
ACT
2500263
delhi
687945
delhi


output2:

id-110
name-ACT
contactNo-2500263
address-delhi
pincode-687945
id-110
name-ACT
contactNo-2500263
address-delhi
pincode-687945
 */

import java.util.*;
class College
{
   private int id;
   private String name; 
   private int contactNo;
   private String address;
   private int pinCode;

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
   public int getContactNo()
   {
    return contactNo;
   }
   public void setContactNo(int contactNo)
   {
    this.contactNo=contactNo;
   }
   public String getAddress()
   {
    return address;
   }
   public void setAddresss(String address)
   {
    this.address=address;
   }
   public int getPinCode()
   {
    return pinCode;
   }
   public void setPincode(int pinCode)
   {
    this.pinCode=pinCode;
   }
   public College(int id,String name,int contactNo,String address, int pinCode)
   {
    this.id=id;
    this.name=name;
    this.contactNo=contactNo;
    this.address=address;
    this.pinCode=pinCode;
   }
}
public class college_solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        College[] arr=new College[4];
        for(int i=0;i<4;i++)
        {
            int a=sc.nextInt(); sc.nextLine();
            String b=sc.nextLine();
            int c=sc.nextInt(); sc.nextLine();
            String d=sc.nextLine();
            int e=sc.nextInt(); sc.nextLine();

            arr[i]=new College(a,b,c,d,e);
        }
        College res=findCollegeWithMaximumPincode(arr);
        String address=sc.nextLine();
        if(res!=null)
        {
            System.out.println("ID : "+res.getId());
            System.out.println("Name : "+res.getName());
            System.out.println("Contact No : "+res.getContactNo());
            System.out.println("Address : "+res.getAddress());
            System.out.println("Pin : "+res.getPinCode());
        }
        else
        {
            System.out.println("No college found with mentioned attribute");
        }
        College res2=searchCollegeByAddress(arr,address);
        if(res2!=null)
        {
            System.out.println("ID : "+res2.getId());
            System.out.println("Name : "+res2.getName());
            System.out.println("Contact No : "+res2.getContactNo());
            System.out.println("Address : "+res2.getAddress());
            System.out.println("Pin : "+res2.getPinCode());
        }
        else
        {
            System.out.println("No college found with mentioned attribute");
        }
        sc.close();
    }
    public static College findCollegeWithMaximumPincode(College[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i].getPinCode()<arr[j].getPinCode())
                {
                    College temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
       if(arr.length>0)
       {
        return arr[0];
       } 
       else
       {
        return null;
       }
    }
    public static College searchCollegeByAddress(College[] arr,String address)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].getAddress().equalsIgnoreCase(address))
            {
                return arr[i];
            }
        }
        return null;
    }
}
