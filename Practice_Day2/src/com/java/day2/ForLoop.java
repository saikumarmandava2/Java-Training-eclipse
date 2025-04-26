package com.java.day2;

//WAP to print 1 to 10 numbers
public class ForLoop {
	
	public void numbers(int n) {
		for(int i=1;i<=n;i++) {
			System.out.println("Printing numbers : "+ i);
		}
	}
	public static void main(String[] args) {
		int n =10;
		ForLoop obj = new ForLoop();
		obj.numbers(n);
	}
}
