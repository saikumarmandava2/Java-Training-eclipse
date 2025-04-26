package com.java.day1;

public class MethodsEx {
	
	public void addition(int n) {	
		if(n>=0) {
			System.out.println(n+" is a Positive Number");
		}
		else
			System.out.println(n + " is a Negative Number");		
	}
	public static void main(String[] args) {
		int n = -3;
		MethodsEx obj =  new MethodsEx();
		obj.addition(n);
	}
}
