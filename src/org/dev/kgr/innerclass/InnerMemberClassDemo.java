package org.dev.kgr.innerclass;

public class InnerMemberClassDemo {

	public static void main(String[] args) {

		A a1 = new A();
		a1.showNonStatic();
		A.showStatic();

		A.B b1 = a1.new B();
		b1.showNonStatic();
		// A.B.showStatic();
	}
}

class A {

	String aNonStaticName;
	static String aStaticName;

	A() {
		System.out.println("Constructor of A class");
	}

	class B {

		String bNonStaticName;

//		The field bStaticName cannot be declared static in a non-static inner type,
//		unless initialized with a constant expression
//		static String bStaticName;

		B() {
			System.out.println("Constructor of B class");
		}

		public void showNonStatic() {
			System.out.println("showNonStatic() invoked from B inner class");
		}

//		 The method showStatic cannot be declared static;
//		 static methods can only be declared in a static or top level type
//		public static void showStatic() {
//			System.out.println("Show() invoked from A outer class");
//		}
	}

	public void showNonStatic() {
		System.out.println("showNonStatic() invoked from A outer class");
	}

	public static void showStatic() {
		System.out.println("showStatic() invoked from A outer class");
	}
}
