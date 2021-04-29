/* Write a program to input any number and check if it Armstrong number or not */

package HomeWorkWeek8;

import java.util.Scanner;

public class Program10
{

    public static void main(String[] args)
    {

        int number , originalNumber, remainder, result = 0;
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        number=SC.nextInt();

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");

    }

}




