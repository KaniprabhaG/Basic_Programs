package javaTest;

public class primeNumber {
	public static void main(String[] args) {
		int number = 7;
		boolean flag = false;
		for(int i=2; i<=number-1; i++) {
			if(number%i ==0) {
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println(number+" Prime Number.");
		}else {
			System.out.println(number+" Not a PrimeNumber.");
		}		
	}

}
