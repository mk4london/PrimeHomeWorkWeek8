/*
Write a method named sumFirstAndLastDigit with one parameter of type int called number.
The method needs to find the first and the last digit of the parameter number passed to the method,
using a loop and return the sum of the first and the last digit of that number.
If the number is negative then the method needs to return -1 to indicate an invalid value.
*/

package HomeWorkWeek8;


import java.util.Scanner;

public class Program7
{

    public static int sumFirstAndLastDigit(int number)
    {

        // declare variables
        int lastDigit, firstDigit, divisor;
        int totalDigits = 0;
        int sum = 0;

        // find last digit
        lastDigit = number%10;

        // find total number of digits
        totalDigits = findDigits(number);

        // calculate divisor value
        divisor = (int)Math.pow(10, totalDigits-1);

        // find first digit
        firstDigit = number / divisor;

        // add values
        sum = firstDigit + lastDigit;

        return sum;
    }

    // method to find total number of digits
    public static int findDigits(int number)
    {
        int count = 0;
        while(number!=0) {
            count++;
            number = number/10;
        }
        return count;
    }

    public static void main(String[] args)
    {

        // declare variables
        int number = 0;
        int sum = 0;

        // create Scanner class object
        // for reading the values
        Scanner scan =  new Scanner(System.in);

        // read input
        System.out.print("Enter an integer number:: ");
        number = scan.nextInt();

        if (number<0)
        {
            System.out.println("Please Enter the Valid Number");
        }

        // find sum of digits of number
        sum = sumFirstAndLastDigit(number);

        // display result
        System.out.println("The sum of first & last"
                +" digit of the number "+number
                +" = "+ sum);

        // close Scanner class object
        scan.close();
    }

}



