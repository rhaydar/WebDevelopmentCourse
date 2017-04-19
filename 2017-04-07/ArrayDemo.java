class ArrayDemo {
	public static void main(String args[]) {
		// int nums[] = {99, -10, 100_123, 18, -978,	
		// 			  5623, 463, -9, 287, 49};

		// int min,max;

		// min = max = nums[0];
		// for (int i=1; i<10; i++) {
		// 	if (nums[i] < min) {
		// 		min = nums[i];
		// 	}

		// 	if (nums[i] > max) {
		// 		max = nums[i];
		// 	}
		// }

		// System.out.println("min: " + min + ", max: " + max);

		

		// 2-D array
		// int table[][] = new int[3][4];

		// for (int i=0; i<3; i++) {
		// 	for (int j=0; j<4; j++) {
		// 		table[i][j] = 4*i + j + 1;
		// 		System.out.print(table[i][j] + "\t");
		// 	}
		// 	System.out.println();
		// }


		// // Riders example
		// int riders[][] = {
		// 	{1,1,1},
		// 	{2,4},
		// 	{3,9},

		// };

		// // double points[][][] = new double[10][5][3];

		// int i,j;
		// // first five rows
		// for (i=0; i<5; i++) {
		// 	for (j=0; j<10; j++) {
		// 		riders[i][j] = i + j;
		// 		System.out.print(riders[i][j] + "\t");
		// 	}
		// 	System.out.println();
		// }
		// // last 2 rows
		// for (i=5; i<7; i++) {
		// 	for (j=0; j<2; j++) {
		// 		riders[i][j] = i + j;
		// 		System.out.print(riders[i][j] + "\t");
		// 	}
		// 	System.out.println();
		// }


		// int riders[][] = {
		// 	{1,1,1},
		// 	{2,4},
		// 	{3,9},
		// };

		// for (int i=0; i<riders.length; i++) {
		// 	for (int j =0; j<riders[i].length; j++) {
		// 		System.out.print(riders[i][j] + "\t");
		// 	}
		// 	System.out.println();
		// }


		// Enhanced for (for-each) loop
		// for (type varName: collection) {
		// 	//varName
		// }

		// int nums[] = {99, -10, 100_123, 18, -978,	
		// 			  5623, 463, -9, 287, 49};

		// int sum = 0;
		// for (int x: nums) {
		// 	sum += x;
		// }
		// System.out.println(sum/nums.length);

		// Enhanced for loop for iterating through 2-D array
		// int riders[][] = {
		// 	{1,1,1},
		// 	{2,4},
		// 	{3,9},
		// };


		// 4-D array
		// int points[][][][] = new int[1][1][2][3];

		// visualization of 4-D array
		// {
		// 	{
		// 		{
		// 			{ 1,2,3},
		// 			{ 1,2,3}
		// 		}
		// 	}
		// }
		// for (int[][] row: points) {
		// 	for (int[] innerRow: row) {
		// 		for (int el: innerRow) {
		// 			System.out.print(el + "\t");
		// 		}
		// 		System.out.println();
		// 	}
		// 	System.out.print("\n.\n");
			
		// }

		// int nums[] = {99, -10, 100_123, 18, -978,	
		// 			  5623, 463, -9, 287, 49};

		// int x = -19;
		// boolean foundX = false;
		// for (int el: nums) {
		// 	if (x == el) {
		// 		System.out.println("found " + x);
		// 		foundX = true;
		// 		break;
		// 	}
		// }
		// if (!foundX) {
		// 	System.out.println(x + " not found");
		// }

		// String str = new String("Hiei");
		// String str2 = "Hiei Kurama";
		// str.equals(str2);
		// System.out.println(str.compareTo(str2));
		// System.out.println(str.length());
		// System.out.println(str.charAt(3));
		// System.out.println(str.indexOf('t'));
		// System.out.println(str.lastIndexOf('t'));
		// String str3 = str.substring(0,3);
		// System.out.println(str3);



		// CLA
		// System.out.println(args.length);
		// for (String arg: args) {
		// 	System.out.println(arg);
		// }

		int x = -10;
		int absOfX;
		// if (x < 0) {
		// 	absOfX = -x;
		// }
		// else {
		// 	absOfX = x;
		// }

		absOfX = (x < 0) ? -x:x;
		System.out.println(absOfX);

	}
}