/**
 * 
 */
package controller;

/**
 * @date   :2016. 6. 14.
 * @author :ckan
 * @file   :Calc.java
 * @story  :
 */
public class Calc {
	public String execute(int inputNum1,String opcode, int inputNum2){
		int result = 0;
	    int num1 = inputNum1;
		String op = opcode;
		int num2 = inputNum2;
				
		switch (op) {
		case "+":
			result  = num1 + num2;
			op = "+";
			break;
		case "-":
			result  = num1 - num2;
			op = "-";
			break;
		case "*":
			result  = num1 * num2;
			op = "*";
			break;	
		case "/":
			result  = num1 / num2;
			op = "/";
			break;	
		case "%":
			result  = num1 % num2;
			op = "%";
			break;
		default:
			System.out.println("연산자 는 +,-,*,/,% 중 하나 입니다.");
			break;
		}
		//---------- out -----------------
		return num1+op+num2+"="+result;
	}
	
}
