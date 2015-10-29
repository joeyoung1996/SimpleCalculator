import java.util.Scanner;
import java.lang.String;
public class Calculator 
{
	public static void main(String[] args) 
	{
		double firstNumber = 0;
		double secondNumber = 0;
		double answer = 1;
		int loop = 1;
		Scanner input = new Scanner(System.in);
		String operation = null;
		String confirmation;
		String operationWord = null;
		
		while (loop == 1)
		{
			
		System.out.println("Please enter the first number in your calculation: ");
		firstNumber = input.nextDouble();
		
		System.out.println("Now, enter the operation to be performed (ie + - * /) : ");
		operation = input.next();
		
		System.out.println("Great, now enter the secondnumber: ");
		secondNumber = input.nextDouble();
		
		System.out.println("You have entered: " + firstNumber + " " + operation + " " + secondNumber + ". ");
		System.out.println("Is this correct? Y/N");
		confirmation = input.next();
	
		
		if (confirmation.equals("Y"))
		{
			if (operation.equals("+"))
			{
				answer = firstNumber + secondNumber;
				operationWord = "sum";
			}
			else if (operation.equals("-"))
			{
				answer = firstNumber - secondNumber;
				operationWord = "difference";
			}
			else if (operation.equals("*"))
			{
				answer = firstNumber * secondNumber;
				operationWord = "product";
			}
			else if (operation.equals("/"))
			{
				answer = firstNumber / secondNumber;
				operationWord = "quotient";
			}
		}
		else
		{
			System.out.println("Please correct the calculation. ");
			loop = 1;		
		}
		System.out.println("The " + operationWord + " of " + firstNumber + " " + operation + " " + secondNumber + " = " + answer);
		System.out.println("Would you like to continue? Y/N");
		confirmation = input.next();
		if (confirmation.equals("Y"))
		{
			loop = 1;
		}
		else
		{
			System.out.println("Goodbye!");
			loop = 0;
		}
		
		}
		
	}
}
