/*
 * Create a class Student with below attributes:

rollNo - int
name - String
subject - String
grade - char
date - String [DD/MM/YYYY]

The above attributes should be private.Write Getter and Setter and parametrized constructor as required.

Create class Solution with main method.
****************************************************************************
Implement one static method: findStudentByGradeAndMonth Solution Class.


findStudentByGradeAndMonth Method:

This method will take an array of Student objects, char value as grade and int value as month 
for input parameters.The method will find out all Students from the given grade and month. 
This method will return array of Student object assending based on their rollNo if found. 
If there is no Student that matches then the method should return null.

for this method- main method should print Student name, subject and total student found [The 
length of the list], if the returned value is not null. If the returned value is null then 
main method should print "No student found".


NOTE:
	1. For Taking char as input use sc.nextLine().charAt(0)
	2. To match/check the month You havee to convert int month in the parameter to String.
	3. No need to count the Student array if return not null just print the array length.


****************************************************************************

Consider the below input and output:


input1:

111
Arijit
Math
B
22/09/2022
101
Priyanka
English
A
30/03/2022
107
Shreosi
History
C
12/05/2022
105
Tatan
Physics
A
27/03/2022
A
3


output1:

Priyanka
English
Tatan
Physics
2


input2:

111
Sohel
Math
B
22/09/2022
101
Priyanka
English
A
30/03/2022
107
Gopa
History
C
12/05/2022
105
Kamal
Physics
A
27/03/2022
A
7

output 2:

No student found
 */

import java.util.*;
class Student
{
    private int rollNo;
    private String name;
    private String subject;
    private char grade;
    private String date;

    public int getRollNo()
    {
        return rollNo;
    }
    public void setRollNo(int rollNo)
    {
        this.rollNo=rollNo;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getSubject()
    {
        return subject;
    }
    public void setSubject(String subject)
    {
        this.subject=subject;
    }
    public char getGrade()
    {
        return grade;
    }
    public void setGrade(char grade)
    {
        this.grade=grade;
    }
    public String getDate()
    {
        return date;
    }
    public void setDate(String date)
    {
        this.date=date;
    }

    public Student(int rollNo,String name,String subject,char grade,String date)
    {
        this.rollNo=rollNo;
        this.name=name;
        this.subject=subject;
        this.grade=grade;
        this.date=date;
    } 
}
public class student_solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Student[] arr=new Student[4];
        for(int i=0;i<4;i++)
        {
            int a=sc.nextInt(); sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();
            char d=sc.nextLine().charAt(0);
            String e=sc.nextLine();

            arr[i]=new Student(a,b,c,d,e);
        }
        char grade=sc.nextLine().charAt(0);
        int month=sc.nextInt(); sc.nextLine();
        Student[] res=findStudentByGradeAndMonth(arr,grade,month);
        if(res!=null)
        {
            for(int i=0;i<res.length;i++)
            {
                System.out.println(res[i].getName());
                System.out.println(res[i].getSubject());
                System.out.println(res.length);
            }
        }
        else
        {
            System.out.println("No student found");
        }
        sc.close();
    }
    public static Student[] findStudentByGradeAndMonth(Student[] arr,char grade,int month)
    {
        Student[] arr2=new Student[0];
        int x=0;
        for(int i=0;i<arr.length;i++)
        {
            x=Integer.parseInt(arr[i].getDate().substring(3,5));
            if(arr[i].getGrade()==grade && x==month)
            {
                arr2=Arrays.copyOf(arr2,arr2.length+1);
                arr2[arr2.length-1]=arr[i];
            }
        }
        for(int i=0;i<arr2.length-1;i++)
        {
            for(int j=i+1;j<arr2.length;j++)
            {
                if(arr2[i].getRollNo()>arr2[j].getRollNo())
                {
                    Student temp=arr2[i];
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
