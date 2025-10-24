package Calculator;

import java.util.Scanner;

import CustomException.WrongOperatorException;

public class Calculator {
	public static int calculator(int a , int b , String operator) throws WrongOperatorException {
		switch(operator) {
		case "+"->{
			return a+b;
		}
		case "-"->{
			return a-b;
		}
		case "/"->{
			return a/b;
		}
		case "*"->{
			return a*b;
		}
		case "%"->{
			return a%b;
		}
		default->{
			throw new WrongOperatorException("Please enter correct operator");
		}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			int a = sc.nextInt();
			int b=sc.nextInt();
			String operator = sc.next();
			System.out.println(calculator(a , b , operator));
		}catch(WrongOperatorException e) {
			System.out.println("Exception:"+e.getMessage());
		}catch(Exception e) {
			System.out.println("Exception:"+e.getMessage());
		}
	}
}
