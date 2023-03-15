package org.dev.kgr.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamSortedDescendingOrderDemo {

	public static void main(String[] args) {

		List<Integer> arList = new ArrayList<Integer>();
		arList.add(15);
		arList.add(5);
		arList.add(10);
		arList.add(25);
		arList.add(20);

		System.out.println("================ Descending sorting ================");
		Stream<Integer> openStream1 = arList.stream();
		Stream<Integer> filteredStream1 = openStream1.filter(i -> i >= 15);
		Stream<Integer> sortedStreamDesc = filteredStream1.sorted((i1, i2) -> i2.compareTo(i1));
		sortedStreamDesc.forEach(x -> System.out.println(x));

		System.out.println("================ Ascending sorting ================");
		Stream<Integer> openStream2 = arList.stream();
		Stream<Integer> filteredStream2 = openStream2.filter(i -> i >= 15);
		Stream<Integer> sortedStreamAsc = filteredStream2.sorted((i1, i2) -> i1.compareTo(i2));
		sortedStreamAsc.forEach(x -> System.out.println(x));

		System.out.println("============= Single Line code =============");

		System.out.println("================ Descending sorting ================");
		Stream<Integer> newFilteredsortedStreamDesc = arList.stream().sorted((i1, i2) -> i2.compareTo(i1));
		newFilteredsortedStreamDesc.forEach(x -> System.out.println(x));

		System.out.println("================ Ascending sorting ================");
		Stream<Integer> newFilteredsortedStreamAsc = arList.stream().sorted((i1, i2) -> i1.compareTo(i2));
		newFilteredsortedStreamAsc.forEach(x -> System.out.println(x));

	}
}
