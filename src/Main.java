import calculationclass.Calculation;

import java.util.Scanner;

/**
 * Java Program of a simple calculation application.
 * This application produces calculation of addition, subtraction, division, and multiplication
 * With a Calculation class that has calculation methods and an overloaded constructor.
 *
 * @author Kgotso Matjato
 */

public class Main
{
    public static void main(String[] args)
    {
        //Scanner class to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Please enter the operator (+, -, * or /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Please enter the second number: ");
        int num2 = scanner.nextInt();

        //instantiating my object
        Calculation calculation = new Calculation(num1,num2);

        //condition statement to check which operator the user chooses to perform the calculation
        switch(operator)
        {
            case '+': //addition
                System.out.println(num1 + " + " + num2 + " = " + calculation.add());
                break;

            case '-': //subtraction
                System.out.println(num1 + " - " + num2 + " = " + calculation.subtract());
                break;

            case '*': //multiplication
                System.out.println(num1 + " * " + num2 + " = " + calculation.multiply());
                break;

            case '/': //division
                System.out.println(num1 + " / " + num2 + " = " + calculation.divide());
                break;

            default:
                System.out.println("Invalid Operator");
                break;
        }
    }
}