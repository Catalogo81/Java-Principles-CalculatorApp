package calculationclass;

public class Calculation
{
    public Calculation() {
    }

    public Calculation(int num1, int num2) {
        num1 = 4;
        num2 = 3;

    }

    public int add(int num1, int num2)
    {
        return num1 + num2;
    }

    public int subtract(int num1, int num2)
    {
        return num1 - num2;
    }

    public int multiply(int num1, int num2)
    {
        return num1 * num2;
    }

    public double divide(double num1, double num2)
    {
        return num1 / num2;
    }
}
