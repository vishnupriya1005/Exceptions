package com.onesoft.day08052023;

public class MailValidity {
	public static void main(String[] args) throws MailException {
		String mail="vishnupriya1051997@rediffmail.com";
		if(mail.contains("@gmail.com")) {
			System.out.println("Mail valid");
		} else {
			throw new MailException("invalid mail id");
		}
		
	}

}
