class FailSoftArray {
	private int a[];
	private int errval;
	public int length;

	// constructor for initializing member variables
	FailSoftArray(int size, int errv) {
		a = new int[size];
		errval = errv;
		length = size;
	}

	// get an element given an index
	public int get(int index) {
		if (indexOk(index)) {
			return a[index];
		}
		return errval;
	}

	// set an element at a given index
	public boolean put(int index, int val) {
		if (indexOk(index)) {
			a[index] = val;
			return true;
		}
		return false;
	}

	// check to see if index is within bounds
	private boolean indexOk(int index) {
		if (index >= 0 && index < length) {
			return true;
		}
		return false;
	}
}

class FSDemo {
	public static void main(String[] args) {
		FailSoftArray fs = new FailSoftArray(5, -1);
		int x;

		for (int i=0; i< (2*fs.length); i++) {
			if(fs.put(i, 10*i)) {
				System.out.println("Successfully put " + 10*i + " at index " + i);
			}
			else {
				System.out.println("Failed to put value at index " + i);
			}
		}

		for (int i=0; i< (2*fs.length); i++) {
			System.out.print(fs.get(i) + " ");
		}
		System.out.println();
		
		int b[] = {1,2,4};

		for (int i=0; i<b.length*2; i++) {
			System.out.print(b[i] + " ");
		}

	}
}