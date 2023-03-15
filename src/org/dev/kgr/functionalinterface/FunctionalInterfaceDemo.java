package org.dev.kgr.functionalinterface;

@FunctionalInterface
public interface FunctionalInterfaceDemo {

	void singleAbsMethod();

	default void printName() {
		System.out.println("Welcome to Functional interface");
	}
}
