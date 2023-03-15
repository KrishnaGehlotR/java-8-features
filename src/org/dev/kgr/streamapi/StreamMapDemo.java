package org.dev.kgr.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamMapDemo {

	public static void main(String[] args) {

		List<Integer> arList = new ArrayList<Integer>();
		arList.add(15);
		arList.add(5);
		arList.add(10);
		arList.add(20);
		arList.add(25);

		Stream<Integer> streamMap = arList.stream().map(i -> i * i);
		streamMap.forEach(y -> System.out.println(y));

		// One statement code
		arList.stream().map(i -> i * i).forEach(y -> System.out.println(y));
	}
}
