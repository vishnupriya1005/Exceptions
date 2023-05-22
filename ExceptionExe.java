package com.onesoft.day08052023;

public class ExceptionExe {
	public static void main(String[] args) {
		System.out.println("program starts");
		//try {// write the actual code inside try block where we expect exception
		int a=10;
		int b=0;// instead if we give any number it will show output
		int c=a/b;
		System.out.println(c);
//		}
		//catch(ArithmeticException ae) {// used to handle exception 
		//ae.printStackTrace();	// to print the exception line
		//System.err.println("dont give 0"); //err is used to print the output in red color like an error message
	//	}
		System.out.println("program end");
	}
}
//the exception printed in red line is called stack trace 
// without try can't write catch block and finally can be write without catch nut cannot print last syso