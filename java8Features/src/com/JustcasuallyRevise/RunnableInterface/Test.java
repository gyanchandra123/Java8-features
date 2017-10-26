package com.JustcasuallyRevise.RunnableInterface;

public class Test {

	public static void main(String[] args) {

		MyInterface childRunnableObj = new MyInterface();

		Thread myThread = new Thread(childRunnableObj);

		myThread.start();

		for (int i = 0; i < 2; i++) {
			System.out.println("executed by the main thread");
		}

	}
}
