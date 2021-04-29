/* Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.
*/

package HomeWorkWeek8;

public class Program11
{

    public static int getEvenDigitSum(int number)
    {
        if(number<0)
        {
            return -1;
        }
        int finalNumber=0;
        while(number>0)
        {
            if((number%10)%2==0)
            {
                finalNumber+=number%10;

            }
            number=number/10; //takes out last digit to test the next digit


        }
        return finalNumber;
    }


    public static void main(String[] args)
    {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));

    }

}


