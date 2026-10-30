package myproject;

public class TestDemo1 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		method1();
	}

	static void method1() {
		method2();
		System.out.println("Hello method1");
	}

	static void method2() {
		method3();
		System.out.println("Hello method2");
	}

	static void method3() {
		TestDemo1 t = new TestDemo1();
		t.method4();
		System.out.println("Hello method3");
	}

	void method4() {
		method5();
		System.out.println("Hello method4");
	}

	void method5() {

		System.out.println("Hello method5");
	}
}
