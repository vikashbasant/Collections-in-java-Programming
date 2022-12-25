package in.co.decimal.coll.pojo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfWord {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		String[] strings = string.split(" ");
		Map<String, Integer> map = new HashMap<>();
		for (String str : strings) {
			int temp = map.getOrDefault(str, 0);
			map.put(str, temp + 1);
		}

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

	}
}
