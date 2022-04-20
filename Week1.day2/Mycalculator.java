package week1.day2;

public class Mycalculator {
		public static void main(String[] args) {
			 Calculator obj = new Calculator();
			 //Adding three numbers
			 int sum = obj.addNumber(45, 50, 55);
			 System.out.println(sum);
			 //Sub two numbers
			 int sub = obj.subNumber(123, 101);
			 System.out.println(sub);
			 //Mul two numbers
			 double mul = obj.mulNumber(4.545, 10);
			 System.out.println(mul);
			 //Div two numbers
			 float div = obj.divnumber(4.044F,10);
			 System.out.println(div);
	}

}
