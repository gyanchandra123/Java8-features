package com.JustcasuallyRevise.RunnableInterface;

public class Shortcut {

	public static void main(String[] args) {

		Runnable runnObj = () -> {

			for (int i = 0; i < 3; i++) {
				System.out.println("executed by the child thread");
			}
		};

		Thread threadObj = new Thread(runnObj);

		threadObj.start();

		for (int i = 0; i < 4; i++) {
			System.out.println("executed by the main thread");
		}

	}

}
