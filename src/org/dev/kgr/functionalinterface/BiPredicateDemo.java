package org.dev.kgr.functionalinterface;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

	public static void main(String[] args) {

		BiPredicate<Integer, Integer> checkSumTwo = (a, b) -> a + b >= 5;
		System.out.println("Sum of 2 and 5 is greater than 5 : " + checkSumTwo.test(2, 5));
		System.out.println("Sum of 2 and 1 is greater than 5 : " + checkSumTwo.test(2, 1));
	}
}
