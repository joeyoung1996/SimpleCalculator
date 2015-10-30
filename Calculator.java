import java.util.*;
import java.lang.String;
public class Calculator 
{
	public static void main(String[] args) 
	{
		double firstNumber;
		double secondNumber;
		double answer = 0;
		boolean isProgramOver = false;
		boolean exitConfirmation = false;
		String confirmation = null;
		String operation = null;
		Scanner input = new Scanner(System.in);
		
		while(!isProgramOver)
		{
		
			System.out.println("Please enter the first number: ");
			firstNumber = doubleValidation();
			System.out.println("Please enter the second number: ");
			secondNumber = doubleValidation();
			answer = calculatorIn(firstNumber, secondNumber);
			System.out.println("The answer is: " + answer);
			System.out.println("\nWould you like to perform another calculation? (Y/N)");
			exitConfirmation = false;
			while (!exitConfirmation)
			{
				confirmation = input.next();
				if (confirmation.equalsIgnoreCase("Y"))
				{
					exitConfirmation = true;
					isProgramOver = false;
				}
				else if (confirmation.equalsIgnoreCase("N"))
				{
					exitConfirmation = true;
					isProgramOver = true;
					System.out.println("Goodbye!");
				}
				else
				{
					System.out.println("Please enter either a Y or an N:");
				}
			}
		}
	}
	
	//This method validates the numeric input from the user and validates that it was a numeric value, then returns it to main. 
	public static double doubleValidation()
	{
		double inputDouble = 0;
		boolean isLoopDone = false;
		
		while (!isLoopDone)
		{
			try
			{
				Scanner input = new Scanner(System.in);
				inputDouble = input.nextDouble();
				isLoopDone = true;
			}
				catch(InputMismatchException e)
				{
					System.out.println("Data input error. \n\nPlease enter a numeric value: ");
				}
			
		}
		
		return inputDouble;
	}
	
	//Calculator method. Takes in an operator and determines which math operation to do based on user input. If not recognized, asks user to reenter.
	public static double calculatorIn(double firstNumber, double secondNumber)
	{
		Scanner input = new Scanner(System.in);
		double answer= 0;
		String operation;
		boolean isLoopDone = false;
		
		while (!isLoopDone)
		{
			System.out.println("Please enter the operation to perform: ");
			operation = input.next();
			if (operation.equals("+"))
			{
				answer = firstNumber + secondNumber;
				isLoopDone = true;
			}
			else if (operation.equals("-"))
			{
				answer = firstNumber - secondNumber;
				isLoopDone = true;
			}
		
			else if (operation.equals("*"))
			{
				answer = firstNumber * secondNumber;
				isLoopDone = true;
			}
			else if (operation.equals("/"))
			{
				answer = firstNumber / secondNumber;
				isLoopDone = true;
			}
			else
			{
				System.out.println("Please enter a vaild operation symbol: \n +  -  *  /\n");
				isLoopDone = false;
			}
		
		}
		return answer;
	}
	
}


