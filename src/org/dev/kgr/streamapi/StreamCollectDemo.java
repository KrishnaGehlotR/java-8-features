package org.dev.kgr.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectDemo {

	public static void main(String[] args) {

		List<Integer> arList = new ArrayList<Integer>();
		arList.add(15);
		arList.add(5);
		arList.add(10);
		arList.add(20);
		arList.add(25);

		// Get the stream object
		Stream<Integer> openStream = arList.stream();

		// Configure stream by filtering out required values
		Stream<Integer> filteredStream = openStream.filter(i -> i >= 15);
		List<Integer> newFilteredListOrigin = filteredStream.collect(Collectors.toList());
		newFilteredListOrigin.stream().forEach(x->System.out.println(x));
		
		System.out.println("============= Single Line code =============");
		
		// What we have done:
		// 1. Open stream with .stream()
		// 2. Use lambda expression in filter to filter out the required objects from the stream.
		// 3. Collect all filtered elements and add them to a new list called newFilteredList
		
		List<Integer> newFilteredList = arList.stream().filter(i->i>=20).collect(Collectors.toList());
		newFilteredList.forEach(x->System.out.println(x));
		
	}
}
