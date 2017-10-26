package com.training.accessingWithLambdaHavingArguments2;

public class Test {

	public static void main(String[] args) {

		
		//Parent parentInterface = (medicationName) -> System.out.println("subscribe medicine is " + (medicationName));
		
		Parent parentInterface = (medicationName) ->  (medicationName).length() ;

						 
		//parentInterface.medication("Paramcetamol");
		//parentInterface.medication("Saline injection");
		
		 
		System.out.println( parentInterface.medication("Saline injection"));
		 

	}

}
