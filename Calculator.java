import java.util.*;
import java.lang.String;
public class Calculator 
{
	public static void main(String[] args) 
	{
		double firstNumber;
		double secondNumber;
		String operation = null;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the first number: ");
		firstNumber = doubleValidation();
		System.out.println("Please enter the second number: ");
		secondNumber = doubleValidation();
		System.out.println(calculatorIn(firstNumber, secondNumber));

	}
	
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
	
	
}


