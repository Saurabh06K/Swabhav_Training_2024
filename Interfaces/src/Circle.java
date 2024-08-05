
public class Circle implements Shape {
	int radius = 10;
	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	@Override
	public void area() {
		System.out.println("Area of circle is: "+ (3.14 * radius * radius));
	}

}
