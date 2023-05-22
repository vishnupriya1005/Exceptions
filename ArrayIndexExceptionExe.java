package com.onesoft.day08052023;

public class ArrayIndexExceptionExe {
	public static void main(String[] args) {
		System.out.println("program starts");
		try {
			int[] a = { 100, 200, 300, 400, 500 };
			for (int i = 0; i <=a.length; i++) {
				System.out.println(a[i]);
			}
		} catch (ArrayIndexOutOfBoundsException ie) {
			ie.printStackTrace();
		}
		System.out.println("program ends");
	}

}
