package com.training.SortingArrayListOrdinary;

import java.util.Comparator;

public class CustomComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer Obj1, Integer Obj2) {

		return (Obj1 > Obj2) ? -1 : (Obj1 < Obj2) ? 1 : 0;
	}

}
