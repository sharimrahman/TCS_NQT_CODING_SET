/*
 * Create a class Associate with below attributes:

id - int
name - String 
scores - double
experience - int (in months)

Write getters, setters and parameterized constructor in the above mentioned attribute sequence as required. Create class Solution with main method Implement two static methods - searchAssociateByScores and findAssociateWithMaxExperience in Solution class.



searchAssociateByScores Create a static method searchAssociateByScores in the Solution class. This method will take array of Associate objects and scores as input and returns the Associate object having the mentioned scores. If no associate is found with the given-scores then method returns null.

findAssociateWithMaxExperience Create a static method findAssociateWithMaxExperience in the Solution class. This method will take array of Associate objects and returns the Associate object having the maximum experience.

These methods should be called from the main method.


Write code to perform the following tasks:

1. Take necessary input variable and call searchAssociateByScores. For this method - The main method should print the Associate ID and name (as shown in the sample output) from the returned Associate object array if the returned value is not null. If the returned value is null then it should print "No Associate found with mentioned scores"



2. Take necessary input variable and call findAssociateWithMaxExperience. For this method - The main method should print the Associate ID with the maximum of mentioned attribute (experience). The above mentioned static methods should be called from the main method. Also write the code for accepting the inputs and printing the outputs. Don't use any static test or formatting for printing the result. Just invoke the method and print the result

Note:

All String comparison needs to be case in-sensitive

You can use/refer the below given sample input and output to verify your solution. No two objects will have the same experience.

Sample Input (below) description: The 1st input taken in the main section is the number of Associate objects to be added to the list of Associate.

The next set of inputs are id,name,scores,experience for each Associate object taken one after other and is repeated for number of Associate objects given in the first line of input. The last line of inputs will be the arguments which needs to be passed as parameter to the methods.

Consider below sample input and output to test your code:

Sample Input 1 - public

4
Nisha
105
35
2
Uma
107
15
3
manu
101
43
7
delma
112
26
10
43   

Sample Output 1
101
manu
112

Sample Input 2-public

4
105
Nisha
35
2
107
Uma
15
3
101
manu
43
7
112
delma
26
10
10

Sample Output 2

No Associate found with mentioned scores
112
 */

import java.util.*;
class Associate
{
    private int id;
    private String name; 
    private double scores;
    private int experience;

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
    public double getScores()
    {
        return scores;
    }
    public void setScores(double scores)
    {
        this.scores=scores;
    }
    public int getExperience()
    {
        return experience;
    }
    public void setExperience(int experience)
    {
        this.experience=experience;
    }

    public Associate(int id, String name, double scores, int experience)
    {
        this.id=id;
        this.name=name;
        this.scores=scores;
        this.experience=experience;
    }
}
public class associate_solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Associate[] arr=new Associate[4];
        for(int i=0;i<4;i++)
        {
            int a=sc.nextInt(); sc.nextLine();
            String b=sc.nextLine();
            double c=sc.nextDouble(); sc.nextLine();
            int d=sc.nextInt(); sc.nextLine();

            arr[i]=new Associate(a,b,c,d);
        }
        double scores=sc.nextDouble(); sc.nextLine();
        Associate res=searchAssociateByScores(arr,scores);
        if(res!=null)
        {
            System.out.println(res.getId());
            System.out.println(res.getName());
        }
        else
        {
            System.out.println("No Associate found with mentioned scores");
        }
        Associate res2=findAssociateWithMaxExperience(arr);
        if(res2!=null)
        {
            System.out.println(res2.getId()+" ");
        }
        sc.close();
    }
    public static Associate searchAssociateByScores(Associate[] arr, double scores)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].getScores()==scores)
            {
                return arr[i];
            }
        }
        return null;
    }
    public static Associate findAssociateWithMaxExperience(Associate[] arr)
    {
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].getExperience()>max)
            {
                max=arr[i].getExperience();
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].getExperience()==max)
            {
                return arr[i];
            }
        }
        return null;
    }
}
