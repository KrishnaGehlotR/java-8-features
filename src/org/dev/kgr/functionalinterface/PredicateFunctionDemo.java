package org.dev.kgr.functionalinterface;

import java.util.function.Predicate;

public class PredicateFunctionDemo {

	public boolean testStringLenght(String str) {
		if (str.length() >= 5) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		PredicateFunctionDemo pfd = new PredicateFunctionDemo();
		System.out.println(pfd.testStringLenght("Kris"));

		Predicate<String> checkLength = (s) -> s.length() >= 5;
		System.out.println("The length of String is greater than 5 : " + checkLength.test("Krish"));
	}
}
