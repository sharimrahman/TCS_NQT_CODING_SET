import java.util.Scanner;

public class factOfNumbers 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) 
        {
            int num = scanner.nextInt();
            int fact = 1;

            for (int j = 1; j <= num; j++) 
            {
                fact=fact*j;
            }

            System.out.println("Factorial of " + num + " is: " + fact);
        }

        scanner.close();
    }
}