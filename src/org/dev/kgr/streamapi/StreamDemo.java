package org.dev.kgr.streamapi;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {

		List<Integer> arList1 = new ArrayList<Integer>();
		arList1.add(15);
		arList1.add(5);
		arList1.add(10);
		arList1.add(20);
		arList1.add(25);

		@SuppressWarnings("unused")
		List<Integer> arList2 = new ArrayList<Integer>();

		// Without Stream
		List<Integer> arListFromMethod = findElements(arList1);
		for (Integer i : arListFromMethod) {
			System.out.println(i);
		}

	}

	public static List<Integer> findElements(List<Integer> asList) {

		List<Integer> arList = new ArrayList<Integer>();

		for (Integer i : asList) {
			if (i >= 15) {
				arList.add(i);
			}
		}
		return arList;
	}
}
