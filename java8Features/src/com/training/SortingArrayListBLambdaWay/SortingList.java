package com.training.SortingArrayListBLambdaWay;

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
		
		// custom sorting order:
		Comparator<Integer> comparingNo = (obj1, obj2) -> (obj1 > obj2) ? -1 : (obj1 < obj2) ? 1 : 0;		
		Collections.sort(listObj, comparingNo);
		System.out.println("after  custom sorting :" + listObj);

	}

}
