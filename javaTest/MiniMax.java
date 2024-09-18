package javaTest;

public class MiniMax {
	int[] Min = {15,25,18,55,100,5050,0,250,88,72};
	int minimum = Min[0];
	
	public void min() {
		for(int i=0; i<Min.length;i++) {
			if(minimum>Min[i]) {
				minimum = Min[i];
			}			
		}
		System.out.println("Minimum: "+minimum);
	}
	
	public void Max() {
		int Maximum = Min[0];
		for(int i=0; i<Min.length;i++) {
			if(Maximum<Min[i]) {
				Maximum=Min[i];
			}
		}
		System.out.println("Maximum: "+Maximum);
		
	}
	
	public static void main(String[] args) {
		MiniMax obj = new MiniMax();
		obj.min();
		obj.Max();
	}
}
