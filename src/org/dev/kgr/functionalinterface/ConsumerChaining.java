package org.dev.kgr.functionalinterface;

import java.util.function.Consumer;

public class ConsumerChaining {

	public static void main(String[] args) {

		Consumer<Integer> squareMe = i -> System.out
				.println("Taking an input and performing square and return nothing : " + i * i);
		squareMe.accept(5);

		Consumer<Integer> doubleMe = i -> System.out
				.println("Taking an input and performing double and return nothing : " + 2 * i);
		doubleMe.accept(5);

		System.out.println("=================== Consumer chaining ===================");
		squareMe.andThen(doubleMe).accept(5);
	}

}
