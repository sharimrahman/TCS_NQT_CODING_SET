/*
 * Create a class Cinema with the below attributes:
movieId - int
director - String
rating - int
budget-int
@@ -13,13 +12,16 @@ Create class Solution with the main method.
Implement two static methods - findAvgBudgetByDirector and getMovieByRatingBudget in Solution class.

findAvgBudgetByDirector method:
----------------------------------
This method will take two input parameters - array of Movie objects and string parameter director.
The method will return the average of the budget attribute from Movie objects directed by the director passed as parameter.
If no movie with the given director is present in the array of movie objects, then the method should return 0.

getMovieByRatingBudget method:
----------------------------------
This method will take two int parameters rating and budget, along with the array of movie objects.
The method will return the movie object, if the input parameters rating and budget, matches with the rating and budget 
attribute of the movie object respectively.

Also check if rating is a factor of budget (eg: 3 is a factor of 12 because 3 divides 12 without leaving a remainder).
If any of the conditions are not met, then the method should return null.
@@ -30,39 +32,38 @@ The budget mentioned are in crores and in INR.

These above mentioned static methods should be called from the main method.

For findAvgBudgetByDirector method - The main method should print the average budget as it is if the returned value is greater than 0, or it
should print "Sorry - The given director has not yet directed any movie".

For getMovieByRatingBudget method - The main method should print the movieId of the returned movie object. If the returned value is null
then it should print "Sorry - No movie is available with the specified rating and budget requirement".

Before calling these static methods in main, use Scanner object to read the values of four
Movie objects referring attributes in the above mentioned attribute sequence.
Next, read the value for director, rating and budget.

## Input

    1101
    GVM
    4
    100
    1201
    Shankar
    5
    500
    1301
    Shankar
    3
    50
    1401
    GVM
    5
    300
    GVM
    5
    300

## Output

    200
    1401
 */


import java.util.*;
class Cinema
{
    private int movieId;
    private String director;
    private int rating;
    private int budget;

    public int getMovieId()
    {
        return movieId;
    }
    public void setMovieId(int movieId)
    {
        this.movieId=movieId;
    }
    public String getDirector()
    {
        return director;
    }
    public void setDirector(String director)
    {
        this.director=director;
    }
    public int getRating()
    {
        return rating;
    }
    public void setRating(int rating)
    {
        this.rating=rating;
    }
    public int getBudget()
    {
        return budget;
    }
    public void setBudget(int budget)
    {
        this.budget=budget;
    }

    public Cinema(int movieId,String director,int rating, int budget)
    {
        this.movieId=movieId;
        this.director=director;
        this.rating=rating;
        this.budget=budget;
    }
}
public class cinema_solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Cinema[] arr=new Cinema[4];
        for(int i=0;i<4;i++)
        {
            int a=sc.nextInt(); sc.nextLine();
            String b=sc.nextLine();
            int c=sc.nextInt(); sc.nextLine();
            int d=sc.nextInt(); sc.nextLine();

            arr[i]=new Cinema(a,b,c,d);
        }
        String director=sc.nextLine();
        int rating=sc.nextInt(); sc.nextLine();
        int budget=sc.nextInt(); sc.nextLine();
        int ans=findAvgBudgetByDirector(arr,director);
        if(ans!=0)
        {
            System.out.println(ans);
        }
        else
        {
            System.out.println("Sorry - The given director has not yet directed any movie");
        }
        Cinema res=getMovieByRatingBudget(arr,rating,budget);
        if(res!=null)
        {
            System.out.println(res.getMovieId());
        }
        else
        {
            System.out.println("Sorry - No movie is available with the specified rating and budget requirement");
        }
        sc.close();
    }
    public static int findAvgBudgetByDirector(Cinema[] arr,String director)
    {
        int sum=0,count=0,avg;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].getDirector().equalsIgnoreCase(director))
            {
                sum=sum+arr[i].getBudget();
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
    public static Cinema getMovieByRatingBudget(Cinema[] arr,int rating, int budget)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].getRating()==rating && arr[i].getBudget()==budget)
            {
                if(arr[i].getBudget()%arr[i].getRating()==0)
                {
                    return arr[i];
                }
            }
        }
        return null;
    }
}
