import java.util.Scanner;
import java.lang.String;
public class Calculator 
{
	public static void main(String[] args) 
	{
		double firstNumber = 0;
		double secondNumber = 0;
		double answer = 1;
		boolean isProgramDone = false;
		boolean wasOperatorChosen = false;
		boolean isConfirmationDone = false;
      Scanner input = new Scanner(System.in);
		
		String operation = null;
		String confirmation;
		String operationWord = null;
		
		while (isProgramDone = false)
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
	
		while(isConfirmationDone = false)
		{
		if (confirmation.equalsIgnoreCase("Y"))
		{
			isConfirmationDone = true;
			while(wasOperatorChosen == false)
			{
			if (operation.equals("+"))
			{
				answer = firstNumber + secondNumber;
				operationWord = "sum";
				wasOperatorChosen = true;
			}
			else if (operation.equals("-"))
			{
				answer = firstNumber - secondNumber;
				operationWord = "difference";
				wasOperatorChosen = true;
			}
			
			else if (operation.equals("*"))
			{
				answer = firstNumber * secondNumber;
				operationWord = "product";
				wasOperatorChosen = true;
			}
			else if (operation.equals("/"))
			{
				answer = firstNumber / secondNumber;
				operationWord = "quotient";
				wasOperatorChosen = true;
			}
			else
			{
				System.out.println("Please enter one of the operator symbols ( + - * /");
			}
		}
		}
		else if (confirmation.equalsIgnoreCase("N"))
		{
			System.out.println("Please correct the calculation. ");
			isProgramDone = false;
			wasOperatorChosen = false;
			isConfirmationDone = false;
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
			isProgramDone = false;
		}
		else
		{
			System.out.println("Goodbye!");
			isProgramDone = true;
		}
		
		}
		
	}
}
	}


