package org.dev.kgr.innerclass;

import org.dev.kgr.innerclass.A.B;

public class InnerNestedClassDemo {

	public static void main(String[] args) {

		C.D d1 = new C.D();
		C.D.showStatic();
		d1.showNonStatic();
	}
}

class C {

	String cNonStaticName;
	static String cStaticName;

	static class D {

		String bNonStaticName;
		static String bStaticName;

		D() {
			System.out.println("Constructor of D class");
		}

		public void showNonStatic() {
			System.out.println("showNonStatic() invoked from D inner class");
		}

		public static void showStatic() {
			System.out.println("showStatic() invoked from D inner class");
		}
	}

	public void show() {
		System.out.println("Show() invoked from A outer class");
	}

	public void D() {
		// TODO Auto-generated method stub

	}
}
