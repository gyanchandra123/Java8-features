package com.training.SortingTreesSetOrdinary;

import java.util.Comparator;
import java.util.TreeSet;

public class SortingSet {

	public static void main(String[] args) {

		// default sorting :-
		TreeSet<Integer> numbers = new TreeSet<Integer>();
		numbers.add(12);
		numbers.add(1);
		numbers.add(342);
		numbers.add(-12);

		System.out.println(numbers);

		// custom sorting :-
		TreeSet<Integer> numbers2 = new TreeSet<Integer>((obj1, obj2) -> (obj1 > obj2) ? -1 : (obj1 < obj2) ? 1 : 0);
		numbers2.add(12);
		numbers2.add(1); 
		numbers2.add(342);
		numbers2.add(-12);

		System.out.println(numbers2);

	}

}
