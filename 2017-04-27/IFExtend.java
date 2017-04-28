interface A {
	void method1();
	void method2();
}

interface B extends A {
	void method3();
}

class MyClass implements B {
	public void method1() {
		System.out.println("Implementation of method1()");
	}

	public void method2() {
		System.out.println("Implementation of method2()");
	}

	public void method3() {
		System.out.println("Implementation of method3()");
	}
}

class IFExtend {
	public static void main(String[] args) {
		MyClass ob = new MyClass();

		ob.method1();
		ob.method2();
		ob.method3();		
	}
}