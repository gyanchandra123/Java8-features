package com.training.implementingLambdaExpressionOnThread;

public class Test {

	public static void main(String[] args) {

		Runnable runObj = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("executed by child thread");
			}
		};

		Thread myThread = new Thread(runObj);

		myThread.start();

		for (int j = 0; j < 5; j++) {
			System.out.println("executed by main thread");
		}

	}

}
