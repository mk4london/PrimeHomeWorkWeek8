/*Display left angle triangle of * using nested for loops*/

package HomeWorkWeek8;

import java.util.Scanner;

public class Program15
{
    public static void main(String args[])
    {

        int n,i, j;
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        n=SC.nextInt();

        for (i = 0; i < n; i++)
        {
            System.out.print(" "); // printing space

            for (j = 0; j <= i; j++) //  inner loop for columns
            {
                System.out.print("* "); // print star
            }
            System.out.println(); // ending line after each row
        }

    }

}

