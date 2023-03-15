package org.dev.kgr.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamFilterDemo {

	public static void main(String[] args) {

		List<Integer> arList = new ArrayList<Integer>();
		arList.add(15);
		arList.add(5);
		arList.add(10);
		arList.add(20);
		arList.add(25);

		Stream<Integer> streamfilter = arList.stream().filter(i -> i % 2 == 0);
		streamfilter.forEach(x -> System.out.println(x));

		// One statement code
		arList.stream().filter(i -> i % 2 == 0).forEach(y -> System.out.println(y));
	}
}
