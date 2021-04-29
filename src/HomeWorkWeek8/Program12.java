/*Write a programme to input any number and check if it is prime or not.*/

package HomeWorkWeek8;

import java.util.Scanner;

public class Program12
{
    public static void main(String[] args)
    {

        int num;
        boolean flag = false;
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        num = SC.nextInt();

        for (int i = 2; i <= num / 2; ++i)
        {
            if (num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }


}
