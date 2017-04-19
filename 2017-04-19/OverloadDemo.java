class Overload {
	// no parameters
	void ovlDemo() {
		System.out.println("No parameters");
	}

	// one parameter
	void ovlDemo(int a) {
		System.out.println("One parameter: " + a);
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
	}
}