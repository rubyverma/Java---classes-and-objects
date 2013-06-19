/* 5. Write a class with multiple constructors and initalize them ?*/

class MultipleConstructors{
	private String var1;
	private int var2;
	
	public MultipleConstructors(){
		this("Hi ",10);
		System.out.println("Running Constructor without parameters");
	}
	
	public MultipleConstructors(String var1){
		this.var1 = var1;
		System.out.println(var1);
	}
	
	public MultipleConstructors(String var1,int var2){
		this("Hi there!");
		System.out.println("Constructor with two parameters of string and int datatype:");
		this.var1 = var1;
		this.var2 = var2;
		System.out.print("String value: " + var1 + "and" + " ");
		System.out.println("Int value: " + var2);
	}
}
public class Program5 {


	public static void main(String[] args) {
		MultipleConstructors newVariable = new MultipleConstructors();
		MultipleConstructors newVariable2 = new MultipleConstructors("Running Constructor with one parameter of string datatype");
		MultipleConstructors newVariable3 = new MultipleConstructors("Hello ",5);

	}

}
