package org.dev.kgr.innerclass;

public class InnerAnonymousClassDemo {

	public static void main(String[] args) {

		E e1 = new E() {

			public void print() {
				System.out.println("print() from anonymous class");
			}

			@Override
			public void show() {
				System.out.println("show() from anonymous class");
			}
		};

		e1.show();
		e1.print();
	}
}

abstract class E {

	public void print() {
		System.out.println("print() from E class");
	}

	public abstract void show();
}
