/*
 * Create class Medicine with below attributes: 

MedicineName - String 
batch - String 
disease - String 
price - int

Create class Solution and implement static method "getPriceByDisease" in the Solution class. 
This method will take array of Medicine objects and a disease String as parameters. 
And will return another sorted array of Integer objects where the disease String matches with the 
original array of Medicine object's disease attribute (case insensitive search).

Write necessary getters and setters.

Before calling "getPriceByDisease" method in the main method, read values for four Medicine objects 
referring the attributes in above sequence along with a String disease. Then call the "getPriceByDisease" 
method and print the result.

Input
-------------

dolo650
FAC124W
fever
100
paracetamol
PAC545B
bodypain
150
almox
ALM747S
fever
200
aspirin
ASP849Q
flu
250
fever

Output
---------
100
200
 */

import java.util.*;
class Medicine
{
    private String MedicineName;
    private String batch;
    private String disease;
    private int price;

    public String getMedicine()
    {
        return MedicineName;
    }
    public void setMedicineName(String MedicineName)
    {
        this.MedicineName=MedicineName;
    }
    public String getBatch()
    {
        return batch;
    }
    public void setBatch(String batch)
    {
        this.batch=batch;
    }
    public String getDisease()
    {
        return disease;
    }
    public void setDisease(String disease)
    {
        this.disease=disease;
    }
    public int getPrice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price=price;
    }

    public Medicine(String MedicineName, String batch, String disease, int price)
    {
        this.MedicineName=MedicineName;
        this.batch=batch;
        this.disease=disease;
        this.price=price;
    }
} 
public class medicine_solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Medicine[] arr=new Medicine[4];
        for(int i=0;i<4;i++)
        {
            String a=sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            int d=sc.nextInt(); sc.nextLine();

            arr[i]=new Medicine(a,b,c,d);
        }
        String disease=sc.nextLine();
        int[] res=getPriceByDisease(arr,disease);
        if(res!=null)
        {
            for(int i=0;i<res.length;i++)
            {
                System.out.println(res[i]);
            }
        }
        else
        {
            System.out.println("No Medicine Found");
        }
        sc.close();
    }
    public static int[] getPriceByDisease(Medicine[] arr,String disease)
    {
        int[] arr2=new int[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].getDisease().equals(disease))
            {
                arr2=Arrays.copyOf(arr2,arr2.length+1);
                arr2[arr2.length-1]=arr[i].getPrice();
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
