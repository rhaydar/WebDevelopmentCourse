abstract class TwoDShape {
	private double width;
	private double height;

	// default constructor
	TwoDShape() {
		width = height = 0;
	}

	// parametrized constructor
	TwoDShape(double x, double y) {
		width = x;
		height = y;
	}

	// setter and getter for width
	void setWidth(double x) {
		width = x;
	}
	double getWidth() {
		return width;
	}

	// setter and getter for height
	void setHeight(double y) {
		height = y;
	}

	double getHeight() {
		return height;
	}

	abstract double area();
}

class Triangle extends TwoDShape {
	Triangle(double i, double j) {
		super(i,j);
	}

	double area() {
		return getWidth()*getHeight()/2;
	}
}

class Rectangle extends TwoDShape {
	Rectangle(double l, double w) {
		super(l,w);
	}

	double area() {
		return getWidth()*getHeight();
	}
}

class AbsShape {
	public static void main(String[] args) {
		// TwoDShape ob1 = new TwoDShape(2,3);
		TwoDShape ob1;
		ob1 = new Triangle(2,3);
		System.out.println(ob1.toString());

		// ob1 = new Rectangle(2,4);
		// System.out.println(ob1.area());
	}
}

