package HomeWorkWeek8;

import java.util.Scanner;

public class MinAndMaxInputChallenge
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Minimum And Maximum
        int count = 0;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        while (true){
            int cnt = count++;
            System.out.print("Enter Number #"+(cnt+1)+": ");
            boolean isValid = input.hasNextInt();
            if(isValid){
                int num = input.nextInt();

                if (num < min) {
                    min = num;
                }else if (num > max){
                    max = num;
                }
            }
            else
            {
                System.out.println("Invalid input..");
                break;
            }
            input.nextLine();
        }
        System.out.println("Min Number : " + min);
        System.out.println("Max Number : " + max);
    }

}
