package com.onesoft.day08052023;

public class NumberFormatExe {
public static void main(String[] args) {
	System.out.println("program starts");
	try {
	int a=Integer.parseInt("vishnu");
	System.out.println(a);
	}
catch(NumberFormatException ne) {
	ne.printStackTrace();
	}
	System.out.println("program end");
}
}
