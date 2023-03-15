package org.dev.kgr.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamMinMaxDemo {

	public static void main(String[] args) {

		List<Integer> arList = new ArrayList<Integer>();
		arList.add(15);
		arList.add(5);
		arList.add(10);
		arList.add(25);
		arList.add(20);

		Stream<Integer> openStream1 = arList.stream();
		Stream<Integer> filteredStream1 = openStream1.filter(i -> i >= 15);
		Integer min = filteredStream1.min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(min);

		Stream<Integer> openStream2 = arList.stream();
		Stream<Integer> filteredStream2 = openStream2.filter(i -> i >= 15);
		Integer max = filteredStream2.max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(max);

		System.out.println("============= Single Line code =============");

		Integer minValue = arList.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(minValue);

		Integer maxValue = arList.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(maxValue);

	}
}
