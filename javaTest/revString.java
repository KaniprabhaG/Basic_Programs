package javaTest;

public class revString {
	public static void main(String[] args) {
		String name= "kaniprabha";

		String revStr = "";
		//System.out.println(revStr);

		for(int i=0; i<name.length(); i++){
		      revStr = name.charAt(i)+revStr;
		}
		System.out.println(revStr);
        String fruit = "Apple";
        
        System.out.println(fruit.charAt(0));
       String Flowername="Jas5ine";
       System.out.println(Flowername.replaceAll("[0-9]", "@-"));//[a-zA-Z]
       
       int x=5;
       x=x++ + ++x;
       System.out.println(x);
       
       
       revString rs = new revString();
       rs.main();
      
	}
	 int main(){
	   	    int i, j, var = 'A';
	   	    for (i = 5; i >= 1; i--) {
	   	        for (j = 0; j < i; j++) 	   	        	
	   	           System.out.println((var + j));
	   	           System.out.println("\n");
	   	    }
	   	    return 0;
	   	}
}
