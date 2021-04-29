package HomeWorkWeek8;

public class DigitSumChallenge {

    public static int sumDigits(long n) {
        int result = 0;

        while (n > 0) {
            result += n % 10;
            n /= 10;
        }

        return result;
    }

    public static void main(String[] args)
    {

        int digits = -2;
        if (digits < 0)
        {
            System.out.println("-1");
            return;
        }

        System.out.println("The sum is " + sumDigits(digits));


    }
}

