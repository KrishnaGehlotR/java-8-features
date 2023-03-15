package org.dev.kgr.functionalinterface;

import java.util.function.Predicate;

public class PredicateJoining {

	public static void main(String[] args) {

		Predicate<String> checkLength = (s) -> s.length() >= 5;
		System.out.println("The length of string is greater than 5 : " + checkLength.test("Predicate"));

		Predicate<String> checkEvenLength = (s) -> s.length() % 2 == 0;
		System.out.println("The length of even string is : " + checkEvenLength.test("Predicate"));

		// Predicate can be joined with and
		System.out.println("Joined with and : " + checkLength.and(checkEvenLength).test("Predicate"));

		// Predicate can be joined with or
		System.out.println("Joined with or : " + checkLength.or(checkEvenLength).test("Predicate"));

		// Predicate can be joined with negate
		System.out.println("Joined with and : " + checkLength.negate().test("Predicate"));

	}
}
