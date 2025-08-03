/*
 * Create a class Book with below attributes

id - int
pages - int
title - String
author - String
price - double

The above attributes should be private, write getters and setters and parameterized constructor as required.

Create a class Solution with main method
--------------------------------------------
Implement two static methods - findBookWithMaximumPrice and searchBookByTitle in Solution class.

findBookWithMaximumPrice :
=============================
Create a static method findBookWithMaximumPrice in the Solution class. This method will take array of Book objects and 
returns the Book object having the maximum Price if found else return null if not found.

searchBookByTitle :
=============================
Create a static method searchBookByTitle in the Solution class. This method will take array of Book objects and Title as 
input and returns the Book object having the mentioned Title if found else return null if not found.

These methods should be called from the main method.

write code to perform the following tasks.

1. Take necessary input variable and call findBookWithMaximumPrice. For this method - The main method should print the Book
 object with the maximum of mentioned attribute as it is if the returned value is not null, or it should print 
 "No Book found with mentioned attribute."

2. Take necessary input variable and call searchBookByTitle. For this method - The main method should print the Book object 
details as it is, if the returned value is not null or it should print "No Book found with mentioned attribute."

The above mentioned static methods should be called from the main method. Also write the code for accepting the inputs and 
printing the outputs. Don't use any static test or formatting for printing the result. Just invoke the method and print the
result.

All String comparison needs to be in case sensitive.

Input:

1
845
Bengali
Arijit
525.50
2
456
English
Raju
412.30
3
1022
History
Kaka
525.50
4
125
geography
MN
524
English

Output:

1 Bengali
3 History
2
456
 */

import java.util.*;
class Book
{
    private int id;
    private int pages;
    private String title;
    private String author;
    private double price;

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public int getPages()
    {
        return pages;
    }
    public void setPages(int pages)
    {
        this.pages=pages;
    }
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String title)
    {
        this.title=title;
    }
    public String getAuthor()
    {
        return author;
    }
    public void setAuthor(String author)
    {
        this.author=author;
    }
    public double getPrice()
    {
        return price;
    }
    public void setPrice(double price)
    {
        this.price=price;
    }
    public Book(int id,int pages,String title,String author,double price)
    {
        this.id=id;
        this.pages=pages;
        this.title=title;
        this.author=author;
        this.price=price;
    }
}
public class book_solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Book[] arr=new Book[4];
        for(int i=0;i<4;i++)
        {
            int a=sc.nextInt(); sc.nextLine();
            int b=sc.nextInt(); sc.nextLine();
            String c=sc.nextLine();
            String d=sc.nextLine();
            double e=sc.nextDouble(); sc.nextLine();

            arr[i]=new Book(a,b,c,d,e);
        }
        String title=sc.nextLine();
        Book[] res=findBookWithMaximumPrice(arr);
        if(res!=null)
        {
            for(int i=0;i<res.length;i++)
            {
                System.out.println(res[i].getId()+" "+res[i].getTitle());
            }
        }
        else
        {
            System.out.println("No Book found with mentioned attribute.");
        }
        Book res2=searchBookByTitle(arr,title);
        if(res2!=null)
        {
            System.out.println(res2.getId());
            System.out.println(res2.getPages());
        }
        else
        {
            System.out.println("No Book found with mentioned attribute.");
        }
        sc.close();
    }
    public static Book[] findBookWithMaximumPrice(Book[] arr)
    {
        Book[] arr2=new Book[0];
        double max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].getPrice()>max)
            {
                max=arr[i].getPrice();
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].getPrice()==max)
            {
                arr2=Arrays.copyOf(arr2,arr2.length+1);
                arr2[arr2.length-1]=arr[i];
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
    public static Book searchBookByTitle(Book[] arr, String title)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].getTitle().equalsIgnoreCase(title))
            {
                return arr[i];
            }
        }
        return null;
    }
}
