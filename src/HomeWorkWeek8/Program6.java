/*

Write a program in Java to display the pattern like a triangle with a number
*/
package HomeWorkWeek8;

import java.util.Scanner;

public class Program6
{

    public static void main(String[] args)
    {
        Scanner SC = new Scanner(System.in);
        int rows;
        System.out.print("Enter the Number of Rows: ");
        rows = SC.nextInt();

        for (int i = 1; i <= rows; ++i)
        {
            for (int j = 1; j <= i; ++j)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}

