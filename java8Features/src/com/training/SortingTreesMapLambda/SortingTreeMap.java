package com.training.SortingTreesMapLambda;

import java.util.TreeMap;
import java.util.TreeSet;

public class SortingTreeMap {

	public static void main(String[] args) {

		// default sorting :-
		TreeMap<Integer, String> numbers = new TreeMap<Integer, String>();
		numbers.put(12, "AAA");
		numbers.put(1, "SSS");
		numbers.put(342, "FFF");
		numbers.put(-12, "EEE");

		System.out.println(numbers);

		// custom sorting :-
		TreeMap<Integer, String> numbers2 = new TreeMap<Integer, String>(
				(obj1, obj2) -> (obj1 > obj2) ? -1 : (obj1 < obj2) ? 1 : 0);
		numbers2.put(12, "AAA");
		numbers2.put(1, "SSS");
		numbers2.put(342, "FFF");
		numbers2.put(-12, "EEE");

		System.out.println(numbers2);

	}

}
