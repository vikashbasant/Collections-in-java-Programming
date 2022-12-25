package in.co.decimal.coll.pojo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OccuranceOfCharactor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		char[] characters = string.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (Character ch : characters) {
			int temp = map.getOrDefault(ch, 0);
			map.put(ch, temp + 1);
		}

//		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//			System.out.println(entry.getKey() + ":" + entry.getValue());
//		}

		map.forEach((k, v) -> System.out.println(k + ": " + v));

	}
}
