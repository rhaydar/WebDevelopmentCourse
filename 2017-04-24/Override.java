class Aa {
	int i,j;

	// default constructor
	Aa() {
		i = j = 0;
		// System.out.println("i and j in Aa constructor: " + i + " " + j);
	}

	// constructor
	Aa(int a, int b) {
		i = a;
		j = b;
		// System.out.println("i and j in Aa(int, int) constructor: " + i + " " + j);
	}

	// displays i and j
	void show() {
		System.out.println("i and j: " + i + ", " + j);
	}
}

class Bb extends Aa {
	int k;

	Bb(int x, int y, int z) {
		super(x,y);
		k = z;
		// System.out.println("i and j in Bb constructor: " + i + " " + j);
	}

	void show() {
		super.show();
		System.out.println("k: " + k);
	}
}

class Override {
	public static void main(String[] args) {
		Bb obB = new Bb(5,7,3);
		Aa obA = new Aa(2,4);
		// Aa ob1 = obA;

		// ob.show();
		// ob1 = obB;
		// ob1.show();
		
		Aa arr[] = new Aa[10];
		for (int i=0; i<5; i++) {
			arr[i] = new Aa(i*2, i*3);
		}

		for (int i=5; i<10; i++) {
			arr[i] = new Bb(i*2, i*3, i*4);
		}

		for (int i=0; i<10; i++) {
			arr[i].show();
		}
	}
}