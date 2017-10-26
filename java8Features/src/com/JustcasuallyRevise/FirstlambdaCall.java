package com.JustcasuallyRevise;

public class FirstlambdaCall {

	public static void main(String[] args) {

		/*
		 * Parent parenObj = ()-> System.out.println("the medication works fine");
		 * 
		 * parenObj.medication();
		 */

		Parent parenObj = medicineName -> medicineName.length();

		int  value = parenObj.medication("paracetamol");
		
		System.out.println(value);

	}

}
