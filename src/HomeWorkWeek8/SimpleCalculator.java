package HomeWorkWeek8;

public class SimpleCalculator {
    double firstNumber;
    double secondNumber;

    public double getFirstNumber()
    {
        return firstNumber;
    }

    public double getSecondNumber()
    {
        return secondNumber;
    }

    public void setFirstNumber (double fno)
    {
        this.firstNumber = fno;
    }

    public void setSecondNumber(double sno)
    {
        this.secondNumber = sno;
    }

    public double getAdditionResult()
    {
        double result = firstNumber + secondNumber;
        return result;
    }

    public double getSubtractionResult()
    {
        double result = firstNumber - secondNumber;
        return result;
    }

    public double getMultiplicationResult()
    {
        double result = firstNumber * secondNumber;
        return result;
    }

    public double getDivisionResult()
    {
        if (secondNumber == 0)
        {
            return 0;
        }
        else
        {
            double result = firstNumber / secondNumber;
            return result;
        }
    }

    public static void main(String[] args)
    {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());

        calculator.setFirstNumber(15);
        calculator.setSecondNumber(3);
        System.out.println("divide= " + calculator.getDivisionResult());
    }

}

