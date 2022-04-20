package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
	
		int n1=0,n2=1,n3,num=8;
		 System.out.println("Fibonacci series:" +n1+" "+n2);
		for(int i=2;i<num;i++){
		 n3=n1+n2; 
		 System.out.println(" "+n3);
		 n1=n2;  
		 n2=n3;  
		 }  
		} 
}

