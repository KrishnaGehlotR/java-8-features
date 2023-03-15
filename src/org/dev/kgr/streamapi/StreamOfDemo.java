package org.dev.kgr.streamapi;

import java.util.stream.Stream;

public class StreamOfDemo {

	public static void main(String[] args) {

		Stream.of(1, 11, 111, 1111, 11111, 111111, 1111111).forEach(x -> System.out.println(x));

		String[] name = { "Stream", "Of method", "forEach" };
		Stream.of(name).filter(x -> x.length() > 6).forEach(x -> System.out.println(x));

	}
}
