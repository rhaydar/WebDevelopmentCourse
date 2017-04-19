class SqrRoot {
	public static void main(String[] args) 
	throws java.io.IOException {
		// double num, sroot, rerr;

		// for (num = 1.0; num < 20.0; num++) {
		// 	sroot = Math.sqrt(num);

		// 	System.out.println("Square root of " + num + " is " + sroot);

		// 	// rounding error
		// 	rerr = num - sroot*sroot;

		// 	System.out.println("Rounding error is " + rerr + "\n");
		// }

		// int x;

		// for (x = 100; x > -100; x -= 5) {
		// 	System.out.println(x);
		// }

		// start from 50, go to 300 in steps of 15.

		// int x,y;
		// y=10;
		// for (x=0; x<y && x <4; x++) {
		// 	System.out.println("x and y: " + x + " " + y);
		// 	y--;
		// }

		// int i;
		// for (i=0; (char) System.in.read() != 'S'; i++) {
		// 	System.out.println("Pass #" + i);
		// }

		// 1 2 3 4 5 
		// sum and factorial
		// int sum = 0;
		// int fact = 1;
		// int i;
		// for (i=1; i <= 5; i++) {
		// 	sum += i;
		// 	// System.out.println(sum);
		// 	fact *= i;
		// }

		// System.out.println("i is " + i);
		// System.out.println("Sum is " + sum);
		// System.out.println("Factorial is " + fact);

		// while loop, print all lowercase letters
		// char ch = 'a';
		// while (ch <= 'z') {
		// 	System.out.print(ch + " ");
		// 	ch++;
		// }
		// System.out.println();

		// int e, result;
		// for (int i=0; i<=10; i++) {
		// 	result = 1;
		// 	e = i;
		// 	// while (e > 0) {
		// 	// 	result *= 3;
		// 	// 	e--;
		// 	// }

		// 	System.out.println("3 to the " + i + " power is " +
		// 						result);

		// }


		// break example
		int num = 100;
		for (int i=0; i<num; i++) {
			if (i*i >= num)
				break;
			System.out.print(i + " ");
		}
		System.out.println("Loop complete");
	}
}