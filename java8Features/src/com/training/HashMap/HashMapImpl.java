package com.training.HashMap;

import java.util.HashMap;

public class HashMapImpl {

	public static void main(String[] args) {

		HashMap<String, String> customers = new HashMap<String, String>();

		customers.put("123412313", "AAAA");
		customers.put("555555", "BBBB");
		customers.put("3333", "GGGG");
		customers.put("11111", "CCCC");

		System.out.println(customers);

	}

}

//{555555=BBBB, 123412313=AAAA, 3333=GGGG, 11111=CCCC}
