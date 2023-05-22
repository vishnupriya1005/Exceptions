package com.onesoft.day08052023;

public class StringExe {
public static void main(String[] args) {
	System.out.println("program starts");
	try {
	String a=null;
	String b="priya";
	String v=a.concat(b);
	System.out.println(v);
}
	catch(NullPointerException ne) {
		ne.printStackTrace();
	}
	System.out.println("program end");
}
}