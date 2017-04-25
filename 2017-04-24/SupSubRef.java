class X {
	int a;

	X(int i) {
		a = i;
	}
}

class Y extends X{
	int b;
	Y(int x, int y) {
		super(x);
		b = y;
	}
}

class SupSubRef {
	public static void main(String[] args) {
		X x1 = new X(10);
		X x2;
		Y y1 = new Y(5, 3);
		x2 = x1;
		System.out.println(x2.a);
		x2 = y1;
		System.out.println(x2.a);
	}
}