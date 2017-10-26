package com.training1;

@FunctionalInterface
public interface Functionalnterface1 {

	public void printName();

	public static void marketting() {
		System.out.println("this is marketting class");
	}

	public default void hiring() {
		System.out.println("Hiring will be done very soon!!!");
	}
	
	public static void main(String[] args) {
		
	}
}
