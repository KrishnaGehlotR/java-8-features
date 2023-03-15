package org.dev.kgr.functionalinterface;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

	public static void main(String[] args) {

		BiConsumer<Integer, Integer> multiplyBoth = (a, b) -> System.out
				.println("Multipliication of 5 and 10 is : " + a * b);
		multiplyBoth.accept(5, 10);

	}

}
