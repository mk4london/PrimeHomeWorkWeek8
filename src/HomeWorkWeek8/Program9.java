/*Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)*/

package HomeWorkWeek8;

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {

        int count, num1 = 1, num2 = 1;
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the number for Fibonacci Series: ");
        count = SC.nextInt();

        for (int i = 1; i <= count; ++i) {
            System.out.print(num1 + " ");

            int Previous = num1 + num2;
            num1 = num2;
            num2 = Previous;
        }
    }
}



