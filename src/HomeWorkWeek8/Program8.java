/*Display right angle triangle of @ using nested for loops

 */
package HomeWorkWeek8;

import java.util.Scanner;

public class Program8
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
                System.out.print("@" + " ");
            }
            System.out.println();
        }
    }


}

