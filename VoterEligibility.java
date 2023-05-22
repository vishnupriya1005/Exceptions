package com.onesoft.day08052023;

public class VoterEligibility {
	public static void main(String[] args) throws AgeException {
	int age=25;
	if(age>=18) {
		System.out.println("eligible to vote");
	} else {
		throw new AgeException("age is not eligible");
	}
	}

}
// custom exception where we will be creating an exception and handling