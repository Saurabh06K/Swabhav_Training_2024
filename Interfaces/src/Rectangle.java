
public class Rectangle implements Shape {
	int length = 30;
	int breadth = 40;
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	@Override
	public void area() {
		System.out.println("Area of rectangle is: "+ (length * breadth));
	}

}
