package org.dev.kgr.functionalinterface;

import java.util.function.BiFunction;

public class BiFunctionDemo {

	public static void main(String[] args) {

		BiFunction<Integer, Integer, Integer> multiplyBoth = (a, b) -> a * b;
		System.out.println("Multipliication of 5 and 10 is : " + multiplyBoth.apply(5, 10));

	}
}
