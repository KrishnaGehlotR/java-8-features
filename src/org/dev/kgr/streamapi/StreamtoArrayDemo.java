package org.dev.kgr.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamtoArrayDemo {

	public static void main(String[] args) {

		List<Integer> arList = new ArrayList<Integer>();
		arList.add(15);
		arList.add(5);
		arList.add(10);
		arList.add(25);
		arList.add(20);

		Stream<Integer> openStream = arList.stream();
		Stream<Integer> filteredStream = openStream.filter(i -> i >= 15);
		Object[] intArr = filteredStream.toArray();
		for (Object o : intArr) {
			System.out.println(o);
		}

		System.out.println("============= Single Line code =============");

		Object[] intArrs = arList.stream().toArray();
		for (Object object : intArrs) {
			System.out.println(object);
		}
	}
}
