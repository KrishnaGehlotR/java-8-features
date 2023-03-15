package org.dev.kgr.staticmethod;

public interface InterfaceWithStaticDemo {

	static void staticMethod() {
		System.out.println("This is static utility method");
	}
	
	public static void main(String[] args) {
		InterfaceWithStaticDemo.staticMethod();
	}
}
