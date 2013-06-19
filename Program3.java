/* 3. Create a class to do math operations add, subtract, multiply and divide ?*/

class MathOperations{
	private int a;
	private int b;
	
	public void add(int a,int b){
		int add = a+b;
		System.out.println("Sum of given numbers is: " + add);
	}
	public void subtract(int a,int b){
		int subtract = a-b;
		System.out.println("Difference of given numbers is: " + subtract);
	}
	public void multiply(int a,int b){
		int multiply = a*b;
		System.out.println("Product of given numbers is: " + multiply);
	}
	public void divide(int a,int b){
		int divide = a/b;
		System.out.println("Division of given numbers is: " + divide);
	}
}
public class Program3 {

	public static void main(String[] args) {

		MathOperations m1 = new MathOperations();
		m1.add(4,10);
		m1.subtract(4, 10);
		m1.multiply(5,9);
		m1.divide(5,2);
	}

}
