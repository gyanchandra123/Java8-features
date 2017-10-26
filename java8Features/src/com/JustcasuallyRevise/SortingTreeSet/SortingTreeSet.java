package com.JustcasuallyRevise.SortingTreeSet;

import java.util.TreeMap;
import java.util.TreeSet;

public class SortingTreeSet {

	public static void main(String[] args) {

		/*
		 * TreeSet<Integer> setObj = new TreeSet<Integer>((obj1, obj2) -> (obj1 > obj2)
		 * ? -1 : (obj1 < obj2) ? +1 : 0);
		 * 
		 * setObj.add(12); setObj.add(1); setObj.add(133); setObj.add(23);
		 * setObj.add(45); setObj.add(10);
		 * 
		 * System.out.println("default  sorting :" + setObj);
		 */

		TreeMap<Integer, String> mapObj = new TreeMap<Integer, String>(
				(obj1, obj2) -> (obj1 > obj2) ? -1 : (obj1 < obj2) ? +1 : 0);

		mapObj.put(1, "AAA");
		mapObj.put(89, "Ao");
		mapObj.put(21, "GGG");
		mapObj.put(5, "EE");
		mapObj.put(3, "DDD");

		System.out.println("default  sorting :" + mapObj);

	}

}
