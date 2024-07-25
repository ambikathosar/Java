package HundredDayCode;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		

		System.out.println("Enter two numbers:");
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();

		System.out.println("Choose an operation: add for addition, sub for subtraction, mul for multiplication");
		String operation = scanner.next();

		switch (operation) {
		case "add":
			double additionResult = num1 + num2;
			System.out.println("The result of addition is: " + additionResult);
//			break;
		case "sub":
			double subtractionResult = num1 - num2;
			System.out.println("The result of subtraction is: " + subtractionResult);
			break;
		
		default:
			System.out.println("Invalid choice. Please choose 1, 2, or 3.");
			break;
		}

		scanner.close();
	}

}
