package org.dev.kgr.functionalinterface;

import java.util.function.Function;

public class FunctionalChaining {

	public static void main(String[] args) {

		Function<Integer, Integer> squareMe = i -> 2 * i;
		System.out.println("Square function : " + squareMe.apply(2));

		Function<Integer, Integer> cubeMe = i -> i * i * i;
		System.out.println("Square function : " + cubeMe.apply(2));

		System.out.println("First squaring using andThen(): " + squareMe.andThen(cubeMe).apply(2));

		System.out.println("First cubing using compose(): " + squareMe.compose(cubeMe).apply(2));
	}
}
