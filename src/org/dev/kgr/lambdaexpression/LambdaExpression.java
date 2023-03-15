package org.dev.kgr.lambdaexpression;

import java.util.function.BiConsumer;

public class LambdaExpression {

	public static void main(String[] args) {

		System.out.println("Using normal method");
		LambdaExpression le = new LambdaExpression();
		le.add(10, 15);

		System.out.println("Using lambda expression");
		BiConsumer<Integer, Integer> bic = (Integer a, Integer b) -> System.out.println(a + b);
		bic.accept(10, 15);
		
		BiConsumer<Integer, Integer> bi = (a,b) -> System.out.println(a + b);
		bi.accept(10, 15);

	}

	public void add(int a, int b) {
		System.out.println(a + b);
	}
}
