package com.onesoft.day08052023;

public class FinallyExe {
public static void main(String[] args) {
	System.out.println("program starts");
	try {
		String val=null;
		System.out.println(val.toUpperCase());
	}
	catch(NullPointerException ne) {
		ne.printStackTrace();
	}// we cannot write any code in between catch and finally block
	finally {
		System.out.println("finally block work");
	}
	System.out.println("program end");
}
}
