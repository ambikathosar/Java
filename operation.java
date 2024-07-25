package HundredDayCode;

import java.util.Scanner;

public class operation {
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter two numbers");
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();
        
		System.out.println("Choose an operation: add for addition, sub for subtraction, mul for multiplication ,div for division");
		String operation = scanner.next();
		
		 if (operation.equals("add")) {
	            double result = num1 + num2;
	            System.out.println("Result: " + result);
	        } else if (operation.equals("sub")) {
	            double result = num1 - num2;
	            System.out.println("Result: " + result);
	        } else if (operation.equals("mul")) {
	            double result = num1 * num2;
	            System.out.println("Result: " + result);
	        } else if (operation.equals("div")) {
//	            
	                double result = num1 / num2;
	                System.out.println("Result: " + result);
	            
	        } else {
	            System.out.println("Error: Invalid operation.");
	        }

	        scanner.close();
	    }
	
	}
	}
	
