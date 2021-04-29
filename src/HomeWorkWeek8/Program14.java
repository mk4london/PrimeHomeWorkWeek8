/*Write a program in Java to display the pattern like a diamond. */

package HomeWorkWeek8;

import java.util.Scanner;

public class Program14
{
    public static void main (String args[])
    {
        Scanner scan=new Scanner(System.in);
        //create a scanner object for input
        System.out.print("Enter the number of rows: ");
        int rows=scan.nextInt();//reads rows from user
        int row=1;
        int i=rows/2;
        while( i>0)
        {    //print upper part
            int j=1;
            while(j<=i)
            {
                System.out.print(" ");//print space
                j++;
            }
            j=1;
            while(j<=row)
            {
                System.out.print("*"+" ");
                j++;
            }
            System.out.println();//move to next line
            row++;
            i--;
        }
        i=0;
        while( i<=rows/2)
        { //print lower part
            int j=1;
            while (j<=i)
            {
                System.out.print(" ");//print space
                j++;
            }
            j=row;
            while( j>=1)
            {
                System.out.print("*"+" ");//print number
                j--;
            }
            System.out.println();//move to next line
            row--;
            i++;
        }
    }
}




