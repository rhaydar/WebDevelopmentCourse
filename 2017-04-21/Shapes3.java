class TwoDShape {
	private double width;
	private double height;

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

	Triangle(String s, double x, double y) {
		setWidth(x);
		setHeight(y);

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
	boolean isSquare() {
		if (getWidth() == getWidth()) {
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

class Shapes3 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle("filled",10,13.5);
		System.out.println("Info on t1:");
		t1.showDim();
		t1.showStyle();
		System.out.println(t1.area());
		System.out.println();

		System.out.println("Info on twoD:");
		TwoDShape twoD = new TwoDShape();
		twoD.setWidth(5);
		twoD.setHeight(4);
		twoD.showDim();
		System.out.println();

		System.out.println("Info on r1:");
		Rectangle r1 = new Rectangle();
		r1.setWidth(3);
		r1.setHeight(8);
		System.out.println(r1.isSquare());
		System.out.println(r1.area());
		System.out.println();
	}
}