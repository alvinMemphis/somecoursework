package calculator;

import java.util.Scanner;

public class CalculatorTets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		double value1;
		double value2;
		double value3;
		System.out.println("input first integer");
		Scanner scan=new Scanner(System.in);
		value1=scan.nextDouble();
		
		System.out.println("input second integer");
		value2=scan.nextDouble();
		
		System.out.println("input third integer");
		value3=scan.nextDouble();
		
		Calculator cal=new Calculator(value1,value2,value3);
		try{
		double result=cal.calcualtion(value1, value2, value3);
		System.out.println("the result is :" +result);
		}
		catch(ArithmeticException e){
			System.out.println("A division by zero occured \n" +e.getMessage());
		}

	}

}
