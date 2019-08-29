package calculator;

public class Calculator {
	double firstvalue,secondvalue,thirdvalue;
 public Calculator(double value1,double value2,double value3){
	 this.firstvalue=value1;
	 this.secondvalue=value2;
	 this.thirdvalue=value3;
 }
 		double calcualtion(double value1,double value2,double value3) throws IllegalArgumentException{
 				if(value3==0){
 					throw new IllegalArgumentException("Cannot divide by zero");
 				}
 			return (value1+value2)/value3;
 }
 
}
