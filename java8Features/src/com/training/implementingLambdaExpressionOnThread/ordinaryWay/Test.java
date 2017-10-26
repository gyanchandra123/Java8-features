package com.training.implementingLambdaExpressionOnThread.ordinaryWay;

public class Test {

	public static void main(String[] args) {

		MyRunnable myRunnable = new MyRunnable();

		Thread myThread = new Thread(myRunnable);

		
		myThread.start();

		for (int j = 0; j < 5; j++) {
			System.out.println("run by main thread");
		}

	}

}
