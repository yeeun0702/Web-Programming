package common;

public class Calculator {
	private int n1;
	private int n2;
	private int op;
	
	
	public int getN1() {
		return n1;
	}
	
	
	public int calc() {

		int result = 0;
		
		switch(op){
		
		case "+" : result = n1 + n2; break;
		case "-" : result = n1 - n2; break;
		case "*" : result = n1 * n2; break;
		case "/" : result = n1 / n2; break;
		}
		return result;
	}
	
	
}
