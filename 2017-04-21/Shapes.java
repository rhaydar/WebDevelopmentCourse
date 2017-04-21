class TwoDShape {
	double width;
	double height;

	void showDim() {
		System.out.println("Width: " + width + ", Height: " + height);
	}
}

class Triangle extends TwoDShape {
	String style;

	double area() {
		return width*height/2;
	}

	void showStyle() {
		System.out.println("The style is " + style);
	}
}

class Rectangle extends TwoDShape {
	boolean isSquare() {
		if (width == height) {
			return true;
		}
		else {
			return false;
		}
	}

	double area() {
		return width*height;
	}
}

class Shapes {
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		t1.width = 10.0;
		t1.height = 13.5;
		t1.style = "filled";
		System.out.println("Info on t1:");
		t1.showDim();
		t1.showStyle();
		System.out.println(t1.area());
		System.out.println();

		System.out.println("Info on twoD:");
		TwoDShape twoD = new TwoDShape();
		twoD.width = 5;
		twoD.height = 4;
		twoD.showDim();
		System.out.println();

		System.out.println("Info on r1:");
		Rectangle r1 = new Rectangle();
		r1.width = 3;
		r1.height = 8;
		System.out.println(r1.isSquare());
		System.out.println(r1.area());
		System.out.println();
	}
}