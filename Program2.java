/* 2. Modify the program to find area and circumference of square, rectangle, triangle or circle with static data ? hint create 4 classes for each and functions in them and ust it.*/

class square {
	private float side;

	public void calculateArea(float side) {
		float area = side * side;
		System.out.println("Area of square is: " + area + " square units");
	}

	public void calculatePerimeter(float side) {
		float perimeter = 4 * side;
		System.out.println("Perimeter of square is: " + perimeter + " units");
		System.out.println();
	}
}

class rectangle {
	private float length;
	private float width;

	public void claculateArea(float length, float width) {
		float area = length * width;
		System.out.println("Area of rectangle is: " + area + " square units");
	}

	public void calculatePerimeter(float length, float width) {
		float perimeter = 2 * (length + width);
		System.out
				.println("Perimeter of rectangle is: " + perimeter + " units");
		System.out.println();
	}

}

class triangle {
	private float base;
	private float height;

	public void calculateArea(float base, float height) {
		float area = (base * height) / 2;
		System.out.println("Area of triangle is: " + area + " square units");
		System.out.println();
	}
}

class circle {
	private float radius;

	public void calculateArea(float radius) {
		float area = (float) (3.14 * radius * radius);
		System.out.println("Area of circle is: " + area + " square units");
	}

	public void calculateCircumference(float radius) {
		float circumference = (float) (2 * 3.14 * radius);
		System.out.println("Circumference of circle is: " + circumference
				+ " units");
	}
}

public class Program2 {

	public static void main(String[] args) {

		square s1 = new square();
		s1.calculateArea(5);
		s1.calculatePerimeter(5);

		rectangle r1 = new rectangle();
		r1.claculateArea(4, 5);
		r1.calculatePerimeter(4, 5);

		triangle t1 = new triangle();
		t1.calculateArea(5, 3);

		circle c1 = new circle();
		c1.calculateArea(4);
		c1.calculateCircumference(4);

	}

}
