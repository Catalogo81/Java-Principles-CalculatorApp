import calculationclass.Calculation;

import java.util.Scanner;

/**
 * Java Program of a simple calculation functionality.
 * This application produces calculation of addition, subtraction, division, and multiplication
 * With a Calculation class that has calculation methods.
 *
 * @author Kgotso Matjato
 */

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter num1: ");
        int num1 = scanner.nextInt();

        System.out.print("Please enter the operator (+, -, * or /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Please enter num2: ");
        int num2 = scanner.nextInt();

        Calculation calculation = new Calculation();
        Calculation calculation2 = new Calculation(5,5);

        switch(operator)
        {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + calculation.add(num1, num2));
                break;

            case '-':
                System.out.println(num1 + " - " + num2 + " = " + calculation.subtract(num1, num2));
                break;

            case '*':
                System.out.println(num1 + " * " + num2 + " = " + calculation.multiply(num1, num2));
                break;

            case '/':
                System.out.println(num1 + " / " + num2 + " = " + calculation.divide(num1, num2));
                break;

            default:
                System.out.println("Invalid Operator");
                break;
        }
    }
}