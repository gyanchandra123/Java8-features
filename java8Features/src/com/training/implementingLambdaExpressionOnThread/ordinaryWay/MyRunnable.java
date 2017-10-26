package com.training.implementingLambdaExpressionOnThread.ordinaryWay;

public class MyRunnable implements Runnable {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("executing child thread");
		}
	}
}
