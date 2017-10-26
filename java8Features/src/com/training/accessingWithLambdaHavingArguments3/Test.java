package com.training.accessingWithLambdaHavingArguments3;

public class Test {

	public static void main(String[] args) {

	 Parent parentInterface = (cost1, cost2)-> cost1*cost2;
	 
	System.out.println("Complete medical bill is : "+parentInterface.medicationBill(112.4, 2230)); 
	 
		 

	}

}
