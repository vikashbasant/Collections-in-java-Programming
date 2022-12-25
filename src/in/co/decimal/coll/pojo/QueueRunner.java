package in.co.decimal.coll.pojo;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparatorAsc implements Comparator<String> {

	@Override
	public int compare(String str1, String str2) {

		return Integer.compare(str1.length(), str2.length());
	}

}

class StringLengthComparatorDsc implements Comparator<String> {

	@Override
	public int compare(String str1, String str2) {

		return Integer.compare(str2.length(), str1.length());
	}

}

public class QueueRunner {
	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>(new StringLengthComparatorDsc());
		queue.addAll(List.of("Zebra", "Monkey", "Cat"));

		for (String s : queue) {
			System.out.println(s);
		}
	}
}
