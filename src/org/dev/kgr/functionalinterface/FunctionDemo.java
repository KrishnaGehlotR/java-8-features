package org.dev.kgr.functionalinterface;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
//		FunctionDemo fd = new FunctionDemo();
//		System.out.println(fd.square(5));

		Function<Integer, Integer> squareMe = i -> i * i;
		System.out.println("Square of 5 is : " + squareMe.apply(5));
	}

//	public int square(int i) {
//		return i * i;
//	}
}
