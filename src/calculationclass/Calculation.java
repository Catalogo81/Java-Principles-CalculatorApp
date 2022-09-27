package calculationclass;

/*
 * A Calculation super class
 * This class performs the basic calculations like multiplication, subtraction, addition and division
 * using only 2 variables
 */

import static java.lang.Double.valueOf;

public class Calculation
{
    //properties
    int num1, num2, result;

    //default constructor
    public Calculation() {
    }

    //non-default constructor
    public Calculation(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    /* ---my methods--- */
    public int add()
    {
        result = num1 + num2;
        return result;
    }

    public int subtract()
    {
        result = num1 - num2;
        return result;
    }

    public int multiply()
    {
        result = num1 * num2;
        return result;
    }

    public double divide()
    {
        result = num1 / num2;
        return result;
    }
}
