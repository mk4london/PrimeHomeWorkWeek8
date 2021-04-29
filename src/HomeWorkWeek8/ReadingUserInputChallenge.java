package HomeWorkWeek8;

import java.util.Scanner;

public class ReadingUserInputChallenge
{
    public static void main(String[] args)
    {
        int[] no = new int[10];
        int x = 0;
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        while (x < no.length)
        {
            System.out.print("Enter No #" + (x + 1) + " : \t");
            boolean isValid = sc.hasNextInt();
            if (isValid)
            {
                no[x] = sc.nextInt();
                sum = no[x] + sum;
            }
            else
            {
                System.out.println("Invalid input..");
                isValid = true;
            }
            x++;
        }

        System.out.println("Sum of Numbers : " + sum);
        sc.close();
    }
}





