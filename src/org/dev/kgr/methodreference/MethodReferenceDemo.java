package org.dev.kgr.methodreference;

import org.dev.kgr.functionalinterface.FunctionalInterfaceDemo;

public class MethodReferenceDemo {

	public static void main(String[] args) {

//		FunctionalInterfaceDemo fidMr = Test::testImplimentation;
//		fidMr.singleAbsMethod();

		FunctionalInterfaceDemo fidLe = () -> System.out.println("Implementation of SAM");
		fidLe.singleAbsMethod();

	}
}

//class Test {
//
//	public static void testImplimentation() {
//		System.out.println("This is test implementation of your abtract method");
//	}
//}
