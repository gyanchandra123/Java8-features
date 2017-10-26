package com.training.accessingWithLambdaHavingArguments;

public class Test {

	public static void main(String[] args) {

		Parent parentInterface = (cost1, cost2) -> System.out.println("total bill is: " + (cost1 + cost2));

		parentInterface.medication(100,200);
		parentInterface.medication(1000,200);

	}

}
