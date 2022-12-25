package in.co.decimal.uqi.pojo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {
		List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
		// uniqe -set
		// tree - sorted order
		// hashset - random order
		// linkedhashset - insert order

		Set<Character> hSet = new HashSet<>();
		System.out.println(hSet);

		Set<Character> lSet = new LinkedHashSet<>(characters);
		System.out.println("LinkedHashSet: " + lSet);

		Set<Character> treeSet = new TreeSet<>(characters);
		System.out.println("TreeSet: " + treeSet);


		// by using for each loop:
		for (Character ch : treeSet) {
			System.out.println(ch);
		}

		// by using iterator:
		Iterator<Character> ch = treeSet.iterator();
		while (ch.hasNext()) {
			System.out.println(ch.next());
		}

	}
}
