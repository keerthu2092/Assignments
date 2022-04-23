package Week2.day1;

public class Letter {

	public static void main(String[] args) {

		 String str = "Testleaf is situated in twin towers teynampet";
		 
		 String[] split = str.split(" ");
	      for (int i = 0; i < split.length; i++) {
	    	  if(split[i].startsWith("t")) {
	    	  System.out.println(split[i]);  
          System.out.println();
       }
	      }
	      }
}


