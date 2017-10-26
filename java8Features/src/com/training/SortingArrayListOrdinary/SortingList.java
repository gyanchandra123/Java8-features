package com.training.SortingArrayListOrdinary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingList {

	public static void main(String[] args) {

		ArrayList<Integer> listObj = new ArrayList<Integer>();

		listObj.add(10);
		listObj.add(0);
		listObj.add(-12);
		listObj.add(103);
		listObj.add(30);

		System.out.println("Before Sorting :" + listObj);

		// default sorting order :-
		Collections.sort(listObj);
		System.out.println("after default sorting :" + listObj);

		// custom sorting order:
		Collections.sort(listObj, new CustomComparator());
		System.out.println("after custom sorting :"+listObj);

	}

}
