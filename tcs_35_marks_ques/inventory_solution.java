/*
 * Create class Inventory with below attributes:

inventoryId - String
maximumQuantity - int
currentQuantity - int
threshold - int

Create class Solution and implement static method "Replenish" in the Solution class.
This method will take array of Inventory objects and a limit int as parameters.
And will return another array of Inventory objects where the limit int is greater than or equal to the original array of 
Inventory object's threshold attribute.

Write necessary getters and setters.

Before calling "Replenish" method in the main method, read values for four Inventory objects referring the attributes in above 
sequence along with a int limit.Then call the "Replenish" method and write logic in main method to print "Critical Filling",
if the threshold attribute is greater than 75. Else if the threshold attribute is between 50 and 75 then print 
"Moderate Filling". Else print "Non-Critical Filling"

Input
---------------------------
1
100
50
50
2
200
60
40
3
150
35
45
4
80
45
40
45

Output
----------------------------
2 Non-Critical Filling
3 Non-Critical Filling
4 Non-Critical Filling
 */

import java.util.*;
class Inventory
{
   private String inventoryId;
   private int maximumQuantity;
   private int currentQuantity;
   private int threshold;
   
   public String getInventoryId()
   {
    return inventoryId;
   }
   public void setInventoryId(String inventoryId)
   {
    this.inventoryId=inventoryId;
   }
   public int getMaximumQuantity()
   {
    return maximumQuantity;
   }
   public void setMaximumQuantity(int maximumQuantity)
   {
    this.maximumQuantity=maximumQuantity;
   }
   public int getCurrentQuantity()
   {
    return currentQuantity;
   }
   public void setCurrentQuantity(int currentQuantity)
   {
    this.currentQuantity=currentQuantity;
   }
   public int getThreshold()
   {
    return threshold;
   }
   public void setThreshold(int threshold)
   {
    this.threshold=threshold;
   }

   public Inventory(String inventoryId,int maximumQuantity,int currentQuantity,int threshold)
   {
    this.inventoryId=inventoryId;
    this.maximumQuantity=maximumQuantity;
    this.currentQuantity=currentQuantity;
    this.threshold=threshold;
   }
}
public class inventory_solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Inventory[] arr=new Inventory[4];
        for(int i=0;i<4;i++)
        {
            String a=sc.nextLine();
            int b=sc.nextInt(); sc.nextLine();
            int c=sc.nextInt(); sc.nextLine();
            int d=sc.nextInt(); sc.nextLine();

            arr[i]=new Inventory(a,b,c,d);
        }
        int limit=sc.nextInt(); sc.nextLine();
        Inventory[] res=Replenish(arr,limit);
        for(int i=0;i<res.length;i++)
        {
            if(res[i].getThreshold()>75)
            {
                System.out.println(res[i].getInventoryId()+" Critical Filling");
            }
            else if(res[i].getThreshold()>=50 && res[i].getThreshold()<=75)
            {
                System.out.println(res[i].getInventoryId()+" Moderate Filling");
            }
            else
            {
                System.out.println(res[i].getInventoryId()+" Non Critical Filling");
            }
        }
        sc.close();
    }    
    public static Inventory[] Replenish(Inventory[] arr,int limit)
    {
        Inventory[] arr2=new Inventory[0];
        for(int i=0;i<arr.length;i++)
        {
            if(limit>=arr[i].getThreshold())
            {
                arr2=Arrays.copyOf(arr2, arr2.length+1);
                arr2[arr2.length-1]=arr[i];
            }
        }
        return arr2;
    }
}
