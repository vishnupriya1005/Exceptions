package com.onesoft.day08052023;

public class IndexBoundExe {
	public static void main(String[] args) {
		System.out.println("program starts");
		try {
		String name="vishnu";
		System.out.println(name.charAt(3));
		}
		catch(StringIndexOutOfBoundsException se) {
			se.printStackTrace();
		}
		System.out.println("program end");
	}

}
