package week1.day2;

public class LearnMethods {

	public static void main(String[] args) {
        // ClassName objectName = new ClassName();
        LearnMethods obj = new LearnMethods();
        // obj.methodName();
        obj.printCarName();
        int CarregNumber  = obj.getCarRegNumber();
        System.out.println(CarregNumber);
        @SuppressWarnings("unused")
		String Carvariant = obj.getCarvariant();
        System.out.println(obj.getCarvariant());
        float mul = obj.mulTwoNumbers(4, 5.5F);
        System.out.println(mul);
    }
		
		
		  public void printCarName() {
		        System.out.println("Mercedes");
		    }
		    public int getCarRegNumber() {
		        int regNumber = (int)9884L;
		        return regNumber;
		    }
		    public String getCarvariant() {
		        return "Disel";
		    }
		    public float mulTwoNumbers(int a, float b) {
		        return a * b;
		    }

	}

