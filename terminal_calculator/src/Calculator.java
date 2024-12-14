import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner uInput = new Scanner(System.in);
		
		double num1;
		double num2;
		String operator;
		double result = 0;

		System.out.println(
				"Hello, fellow user! You shall add, subtract, multiply, find remainder and divide with this terminal app"
				);
		System.out.println("Enter operator, please.");
		operator = uInput.nextLine();
		
		System.out.println("Enter the first number, please.");
		num1 = uInput.nextFloat();

		System.out.println("Enter the second number, please.");
		num2 = uInput.nextFloat();
		
		switch (operator) {

		// +, add, plus
		case "+":
			result = num1 + num2;
			break;
		case "add":
			result = num1 + num2;
			break;
		case "plus":
			result = num1 + num2;
			break;

		// -, subtract, minus
		case "-":
			result = num1 - num2;
			break;
		case "subtract":
			result = num1 - num2;
			break;
		case "minus":
			result = num1 - num2;
			break;

		// /, divide, :
		case "/":
			result = num1 / num2;
			break;
		case "divide":
			result = num1 / num2;
			break;
		case ":":
			result = num1 / num2;
			break;

		// *, multiply, times
		case "*":
			result = num1 * num2;
			break;
		case "multiply":
			result = num1 * num2;
			break;
		case "times":
			result = num1 * num2;
			break;

		// find remainder, %
		case "find remainder":
			result = num1 % num2;
			break;
		case "%":
			result = num1 % num2;

		default:
			System.out.println("!INVALID OPERATOR!");
			uInput.close();
			return;

		}
		

		System.out.println("The result is: " + result);
		System.out.println();
		System.out.println("Thank you for using my program. Goodbye :3");

		uInput.close();

	}

}
