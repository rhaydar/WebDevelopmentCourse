class ScopeDemo {
	public static void main(String args[]) {
		// int x = 10;
		
		// if (x == 10) {
		// 	int y = 40;
		// 	System.out.println("x and y: " + x + ", " + y);
		// 	x = y*2;
		// }
		// int x = 20;
		// System.out.println("x and y: " + x);
		int x = 0;

		// for (x=0; x<3; x++) {
		// 	int y = -1;
		// 	System.out.println("y is " + y);
		// 	y = 100;
		// 	System.out.println("y is now " + y);
		// }

		if (x < 3) {
			int y = -1;
			System.out.println("y is " + y);
			y = 100;
			System.out.println("y is now " + y);
			int y = 20;
		}

		x++;
		if (x < 3) {
			int y = -1;
			System.out.println("y is " + y);
			y = 100;
			System.out.println("y is now " + y);
		}

		x++;
		if (x < 3) {
			int y = -1;
			System.out.println("y is " + y);
			y = 100;
			System.out.println("y is now " + y);
		}

		x++;
		if (x < 3) {
			int y = -1;
			System.out.println("y is " + y);
			y = 100;
			System.out.println("y is now " + y);
		}
	}
}