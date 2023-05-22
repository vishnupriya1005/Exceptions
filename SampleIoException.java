package com.onesoft.day08052023;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SampleIoException {
	public static void main(String[] args) throws IOException {
		System.out.println("program starts");
		File f=new File("D:\\Hello.txt");// where the file is available
		//try {
		FileReader fr=new FileReader(f);
		int temp=0;
		while((temp=fr.read())!=-1) {// in temp it will store the askey value 
			System.out.print((char)(temp));
		}
	}

//	catch(Exception fe) {
//		System.err.println("no file");
//	}
		
	//	System.out.println("end");
	}
//}
// used to read the file from outside folder 
// where the File will read the file from outside whereas FileReader will read only java file

/// check this 