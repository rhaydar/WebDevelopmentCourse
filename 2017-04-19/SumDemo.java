class Summation {
	public int sum;

	// constructor with single parameter
	public Summation(int x) {
		sum = 0;
		for (int i=1; i<=x; i++) {
			sum += i;
		}
	}

	// copy constructor
	public Summation(Summation d) {
		sum = d.sum;
	}
}

class SumDemo {
	public static void main(String[] args) {
		Summation ob = new Summation(5);
		System.out.println(ob.sum);

		Summation ob2 = new Summation(ob);
		System.out.println(ob2.sum);

		Summation ob3 = new Summation(3);
		System.out.println(ob3.sum);

		Summation ob4 = new Summation(ob3);
		System.out.println(ob4.sum);

		Summation ob5;
		for (int i=0; i<5; i++) {
			ob5 = new Summation(i);
			System.out.println(ob5.sum);
		}

	}
}