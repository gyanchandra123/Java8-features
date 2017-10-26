package com.training.accessingWithLambda;

public class Test {

	public static void main(String[] args) {
		 
		Parent parentInterface = 
				()-> System.out.println("this is the parent interface abtstract method implementation ");
		
		parentInterface.medication();

	}

}
