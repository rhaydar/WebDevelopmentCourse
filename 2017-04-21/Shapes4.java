class TwoDShape {
	private double width;
	private double height;

	// default constructor
	TwoDShape() {
		width = 0;
		height = 0;
	}

	// constructor with 2 parameters
	TwoDShape(double w, double h) {
		width = w;
		height = h;
	}
	// setter and getter for width
	double getWidth() {
		return width;
	}
	void setWidth(double x) {
		width = x;
	}

	// setter and getter for height
	double getHeight() {
		return height;
	}
	void setHeight(double y) {
		height = y;
	}

	void showDim() {
		System.out.println("Width: " + width + ", Height: " + height);
	}
}

class Triangle extends TwoDShape {
	String style;

	// default constructor
	Triangle() {
		super();
		style = "";
	}

	// parametrized constructor
	Triangle(String s, double x, double y) {
		super(x, y);

		style = s;
	}

	double area() {
		return getWidth()*getHeight()/2;
	}

	void showStyle() {
		System.out.println("The style is " + style);
	}
}

class Rectangle extends TwoDShape {
	// default constructor
	Rectangle() {
		super();
	}

	// parametrized constructor
	Rectangle(double s, double r) {
		super(s,r);
	}

	boolean isSquare() {
		// dimensions of zero
		if (getWidth() == 0) {
			return false;
		}
		else if (getWidth() == getWidth()) {
			return true;
		}
		else {
			return false;
		}
	}

	double area() {
		return getWidth()*getHeight();
	}
}

class Shapes4 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle("filled", 10, 13.5);
		System.out.println("Info on t1:");
		t1.showDim();
		t1.showStyle();
		System.out.println(t1.area());
		System.out.println();

		System.out.println("Info on twoD:");
		TwoDShape twoD = new TwoDShape(5,4);
		twoD.showDim();
		System.out.println();

		System.out.println("Info on r1:");
		Rectangle r1 = new Rectangle(3,8);
		System.out.println(r1.isSquare());
		System.out.println(r1.area());
		System.out.println();
		int x;
	}
}