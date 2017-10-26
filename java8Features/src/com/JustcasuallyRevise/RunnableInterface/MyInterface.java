package com.JustcasuallyRevise.RunnableInterface;

public class MyInterface implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 3; i++) {
			System.out.println("child thread is executing");
		}

	}

}
