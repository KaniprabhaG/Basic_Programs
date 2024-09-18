package javaTest;

public class exceptionHandle {
	public static void main(String[] args) {
		int a = 8;
		int b =0;
		int c1; 
		try{
			c1= a/b;
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic-Exception");
		}
	}

}
