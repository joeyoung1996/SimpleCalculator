import java.util.Scanner;
import java.lang.String;
public class Calculator 
{
	public static void main(String[] args) 
	{
		double firstNumber = 0;
		double secondNumber = 0;
		double answer = 1;
		int wholeProgramLoop = 1;
		int operatorLoop = 1;
		int confirmationLoop = 0;
		Scanner input = new Scanner(System.in);
		String operation = null;
		String confirmation;
		String operationWord = null;
		
		while (wholeProgramLoop == 1)
		{
			
		System.out.println("Please enter the first number in your calculation: ");
		try
		{
			firstNumber = input.nextDouble();
			System.out.println("Great, now enter the secondnumber: ");
			secondNumber = input.nextDouble();
		}	
			
			
		catch(Exception e)
		{
			
			System.out.println("Please Enter a numeric value");
			
		}
		
		System.out.println("Now, enter the operation to be performed (ie + - * /) : ");
		operation = input.next();
		
		
		System.out.println("You have entered: " + firstNumber + " " + operation + " " + secondNumber + ". ");
		System.out.println("Is this correct? Y/N");
		confirmation = input.next();
	
		while(confirmationLoop == 1)
		{
		if (confirmation.equals("Y") | confirmation.equals("y"))
		{
			confirmationLoop = 0;
			while(operatorLoop == 1)
			{
			if (operation.equals("+"))
			{
				answer = firstNumber + secondNumber;
				operationWord = "sum";
				operatorLoop = 0;
			}
			else if (operation.equals("-"))
			{
				answer = firstNumber - secondNumber;
				operationWord = "difference";
				operatorLoop = 0;
			}
			
			else if (operation.equals("*"))
			{
				answer = firstNumber * secondNumber;
				operationWord = "product";
				operatorLoop = 0;
			}
			else if (operation.equals("/"))
			{
				answer = firstNumber / secondNumber;
				operationWord = "quotient";
				operatorLoop = 0;
			}
			else
			{
				System.out.println("Please enter one of the operator symbols ( + - * /");
			}
		}
		}
		else if (confirmation.equals("N") | confirmation.equals("n"))
		{
			System.out.println("Please correct the calculation. ");
			wholeProgramLoop = 1;
			confirmationLoop = 0;
		}
		else
		{
			System.out.println("Please enter a Y or N.");
		}
		System.out.println("The " + operationWord + " of " + firstNumber + " " + operation + " " + secondNumber + " = " + answer);
		System.out.println("Would you like to continue? Y/N");
		confirmation = input.next();
		if (confirmation.equals("Y"))
		{
			wholeProgramLoop = 1;
		}
		else
		{
			System.out.println("Goodbye!");
			wholeProgramLoop = 0;
		}
		
		}
		
	}
}
	}

