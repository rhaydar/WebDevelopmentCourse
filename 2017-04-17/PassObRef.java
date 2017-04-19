class Test {
	int a, b;

	Test(int i, int j) {
		a = i;
		b = j;
	}

	void change(Test ob) {
		ob.a = ob.a + ob.b;
		ob.b *= -1;
	}
}

class PassObRef {
	public static void main(String[] args) {
		Test ob = new Test(15, 20);

		System.out.println("ob.a and ob.b before change(): " 
			+ ob.a + " " + ob.b);
		ob.change(ob);
		System.out.println("ob.a and ob.b after change(): " 
			+ ob.a + " " + ob.b);

	}
}