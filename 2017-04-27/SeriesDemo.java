interface Series {
	int getNext(); //return next number in series
	void reset(); //restarts
	void setStart(int x); //set starting value
}

class ByTwos implements Series {
	int start;
	int val;

	ByTwos() {
		start = 0;
		val = 0;
	}

	ByTwos(int s) {
		start = val = s;
	}

	public int getNext() {
		val += 2;
		return val;
	}

	public int getPrevious() {
		val -= 2;
		return val;
	}

	public void setStart(int x) {
		start = val = x;
	}

	public void reset() {
		val = start;
	}
}

class ByThrees implements Series {
	int start;
	int val;

	// default constructor
	ByThrees() {
		start = val = 0;
	}

	// parameterized constructor
	ByThrees(int x) {
		start = x;
		val = x;
	}

	public int getNext() {
		val += 3;
		return val;
	}

	public int getPrevious() {
		val -= 3;
		return val;
	}

	public void setStart(int x) {
		start = val = x;
	}

	public void reset() {
		val = start;
	}
}

class SeriesDemo {
	public static void main(String[] args) {
		ByThrees ob = new ByThrees();

		for (int i=0; i<5; i++) {
			System.out.println(ob.getPrevious());
		}

		// ob.reset();
		for (int i=0; i<5; i++) {
			System.out.println(ob.getNext());
		}

		ob.setStart(100);
		for (int i=0; i<5; i++) {
			System.out.println(ob.getNext());
		}
	}
}