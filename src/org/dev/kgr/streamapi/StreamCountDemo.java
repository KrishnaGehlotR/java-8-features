package org.dev.kgr.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamCountDemo {

	public static void main(String[] args) {

		List<Integer> arList = new ArrayList<Integer>();
		arList.add(15);
		arList.add(5);
		arList.add(10);
		arList.add(20);
		arList.add(25);

		// Get the stream
		Stream<Integer> openStream = arList.stream();

		// Configure stream by filtering out required values
		Stream<Integer> filteredStream = openStream.filter(i -> i >= 15);
		long streamCount = filteredStream.count();
		System.out.println(streamCount);

		System.out.println("============= Single Line code =============");

		long count = arList.stream().count();
		System.out.println(count);

	}
}
