package javaTest;

public class ArrayDup {

	int[] dup = {5,10,15,20,100,72,17,15,10,5,17};
	public void method() {
		for(int i=0; i<dup.length;i++) {
			for(int j=i+1;j<dup.length;j++) {
				if(dup[i]==dup[j]) {
					System.out.println("Duplicate Values: "+dup[j]);
				}
			}
		}
	}
	public static void main(String[] args) {
		ArrayDup obj = new ArrayDup();
		obj.method();
	}
}

