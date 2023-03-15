package org.dev.kgr.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamSortedDemo {

	public static void main(String[] args) {

		List<Integer> arList = new ArrayList<Integer>();
		arList.add(15);
		arList.add(5);
		arList.add(10);
		arList.add(25);
		arList.add(20);

		Stream<Integer> openStream = arList.stream();
		Stream<Integer> filteredStream = openStream.filter(i -> i >= 15);
		Stream<Integer> sortedStream = filteredStream.sorted();
		sortedStream.forEach(x -> System.out.println(x));
		
		System.out.println("============= Single Line code =============");
		
		Stream<Integer> newFilteredsortedStream = arList.stream().filter(i->i>=15).sorted();
		newFilteredsortedStream.forEach(x->System.out.println(x));

	}
}
