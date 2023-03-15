package org.dev.kgr.defaultmethod;

public interface InterfaceDemo {

//	 void printAbs();

	default void printName() {
		System.out.println("Welcome to default methods of interface");
	}
}
