class Overload {
	// no parameters
	void ovlDemo() {
		System.out.println("No parameters");
	}

	// // one parameter
	// void ovlDemo(int a) {
	// 	System.out.println("One parameter: " + a);
	// }

	// long ovlDemo(long a) {
	// 	System.out.println(2*a);
	// 	return 2*a;
	// }

	// // float paramter
	// void ovlDemo(float f) {
	// 	System.out.println("float value: " + f);
	// }

	// double parameter
	void ovlDemo(double e) {
		System.out.println("double value: " + e);
	}
}

class OverloadDemo {
	public static void main(String[] args) {
		Overload ob = new Overload();

		// no parameters
		ob.ovlDemo();
		System.out.println();

		// one parameter
		ob.ovlDemo(2);
		System.out.println();

		float d = 1.24F;
		ob.ovlDemo(d);
	}
}