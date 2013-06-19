/* 1. Create a class employee with 4-5 attributes and setter getter for them perform operation such as create 2-3 objects of class, initalize them with data and write a method to display them ? */

class Employee {
	private int empID;
	private String name;
	private int age;
	private float salary;

	public void setInfo(int empID, String name, int age, float salary) {
		this.empID = empID;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public int getEmpID() {
		return empID;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public float getSalary() {
		return salary;
	}

}

public class Program1 {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setInfo(1, "abc", 32, 2000);
		Employee emp2 = new Employee();
		emp2.setInfo(2, "efg", 45, 2400);
		Employee emp3 = new Employee();
		emp3.setInfo(3, "hij", 43, 3000);
		Employee emp4 = new Employee();
		emp4.setInfo(4, "klm", 25, 1800);

		System.out.println("Details of employees: ");
		int empId = emp1.getEmpID();
		System.out.print(empId + " ");
		String name = emp1.getName();
		System.out.print(name + " ");
		int age = emp1.getAge();
		System.out.print(age + " ");
		float sal = emp1.getSalary();
		System.out.println(sal + " ");

		int empId2 = emp2.getEmpID();
		System.out.print(empId2 + " ");
		String name2 = emp2.getName();
		System.out.print(name2 + " ");
		int age2 = emp2.getAge();
		System.out.print(age2 + " ");
		float sal2 = emp2.getSalary();
		System.out.println(sal2 + " ");

		int empId3 = emp3.getEmpID();
		System.out.print(empId3 + " ");
		String name3 = emp3.getName();
		System.out.print(name3 + " ");
		int age3 = emp3.getAge();
		System.out.print(age3 + " ");
		float sal3 = emp3.getSalary();
		System.out.println(sal3 + " ");

		int empId4 = emp4.getEmpID();
		System.out.print(empId4 + " ");
		String name4 = emp4.getName();
		System.out.print(name4 + " ");
		int age4 = emp4.getAge();
		System.out.print(age4 + " ");
		float sal4 = emp4.getSalary();
		System.out.println(sal4 + " ");
	}

}
