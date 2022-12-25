package in.co.decimal.coll.pojo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListRunner {
	public static void main(String[] args) {

		// here this list is immutable:
		List<Integer> list = List.of(1, 2, 3, 4, 5, 6);

		// here this list are mutable:
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);

		List<String> list2 = new Vector<>();
		list2.add("vikash");
		list2.add("vikky");
		list2.add("pirnce");
		list2.add("neha");

		List<Character> list3 = new LinkedList<>();
		list3.add('a');
		list3.add('b');
		list3.add('c');
		list3.add('d');

		// How to iterate: Using iterator:
		Iterator listIterator = list3.iterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}

	}
}
