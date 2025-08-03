/*
 * Create class Team with below attributes:

tId - int
tName - String
tCountry - String
tRun - int

The above attributes should be private.Write Getter and Setter and parametrized constructor as required.

Create class Solution with main method.

Implement One static method-

● findPlayer

findPlayer in the solution class. 
This method will take array of Team objects, int paramater run and String country and returns the Team object where taken 
country is matched with the country of team object and team run is greater than the taken run.

Write code to perform following tasks:

1. In main mehod, take 1st input as integer parameter which shows the number of team object.
2. Take necessary input variable and call findPlayer.
3. All searches should be case insensitive.

For this method- The main method should print the team object. As if the returned value is not null, 
or it should print "No team is found from the given country and run".

Input
------------------
1
Arijit
India
43
2
Doremon
China
40
3
Donal
England
32
35
China



Output
--------------
2
Doremon
China
40
 */

import java.util.*;
class Team
{
    private int tId;
    private String tName;
    private String tCountry;
    private int tRun;

    public int getTId()
    {
        return tId;
    }
    public void setTId(int tId)
    {
        this.tId=tId;
    }
    public String getTName()
    {
        return tName;
    }
    public void setTName(String tName)
    {
        this.tName=tName;
    }
    public String getTCountry()
    {
        return tCountry;
    }
    public void setTCountry(String tCountry)
    {
        this.tCountry=tCountry;
    }
    public int getTRun()
    {
        return tRun;
    }
    public void setTRun(int tRun)
    {
        this.tRun=tRun;
    }

    public Team(int tId,String tName,String tCountry,int tRun)
    {
        this.tId=tId;
        this.tName=tName;
        this.tCountry=tCountry;
        this.tRun=tRun;
    }
}
public class team_solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Team[] arr=new Team[3];
        for(int i=0;i<3;i++)
        {
            int a=sc.nextInt(); sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            int d=sc.nextInt(); sc.nextLine();

            arr[i]=new Team(a,b,c,d);
        }
        int tRun=sc.nextInt(); sc.nextLine();
        String tCountry=sc.nextLine();
        Team ans=findPlayer(arr,tRun,tCountry);
        if(ans!=null)
        {
            System.out.println(ans.getTId());
            System.out.println(ans.getTName());
            System.out.println(ans.getTCountry());
            System.out.println(ans.getTRun());
        }
        sc.close();
    }
public static Team findPlayer(Team[] arr,int tRun,String tCountry)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].getTCountry().equalsIgnoreCase(tCountry) && arr[i].getTRun()>tRun)
            {
                return arr[i];
            }
        }
        return null;
    }
}
