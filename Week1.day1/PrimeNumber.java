package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		int i,m=0,flag=0;   
		  int num=13;
		  m=num/2;    
		   for(i=2;i<=m;i++){    
		    if(num%i==0){    
		     System.out.println(num+" is not prime number");    
		     flag=1;    
		     break;    
		    }    
		   }    
		   if(flag==0)  { System.out.println(num+" is a prime number"); }
		  }//end of else
		}  
