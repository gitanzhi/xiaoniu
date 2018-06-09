package cn.edu360.day03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("1", "3");
		map.put("3", "43");
		map.put("2", "31");
		Set<Entry<String, String>> entrySet = map.entrySet();
		ArrayList<Entry<String, String>> list = new ArrayList<>(entrySet);
		Collections.sort(list, new Comparator<Entry<String, String>>() {
			@Override
			public int compare(Entry<String, String> o1, Entry<String, String> o2) {
				o1.getValue().compareTo(o2.getValue());
				return 0;
			}
		});
		System.out.println(list);
	}
}
