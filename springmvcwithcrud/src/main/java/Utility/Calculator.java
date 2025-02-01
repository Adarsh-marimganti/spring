package Utility;

public class Calculator {
	private String num1;
	private String num2;
	private String op;

	public Calculator(String num1, String num2, String op) {
		this.num1=num1;
		this.num2=num2;
		this.op=op;
	}
	
	public Calculator() {
		// TODO Auto-generated constructor stub
	}

	public int calculate(String num1, String num2, String op) {
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		switch(op) {
		case "+":
			return n1+n2;
		case "-":
			return n1-n2;
		case "*":
			return n1*n2;
		case "/":
			return n1/n2;
		}
		return n2;
	}

}
