package in.co.decimal.coll.pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		List<String> word = new ArrayList<>();
		word.add("fda");
		word.add("bba");
		word.add("cc");
		word.add("dd");
		word.add("aaa");
		word.add("sdfa");

		System.out.println(word.stream().filter(x -> x.endsWith("a")).collect(Collectors.toList()));

//		Iterator<String> wordsIterator = word.iterator();
//		while (wordsIterator.hasNext()) {
//			if (wordsIterator.next().endsWith("a")) {
//
//				System.out.println(wordsIterator.next());
//			}
//		}
//		System.out.println(word);


	}
}
