package hust.soict.dsai.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
// Hoang Van Kien - 20205089
public class NoGarbage {
	
	public static void main(String[] args) {
	String filename = "D:\\OPP\\oolt.vn.20221.20205089.hoangvankien\\LAB03\\test.txt";
	byte[] inputBytes = { 0 };
	long startTime;
	long endTime ;
	
	// Test the processing time using + opertator
	startTime = System.currentTimeMillis();
	
	try {
		inputBytes = Files.readAllBytes(Paths.get(filename));		
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	String outputString = "";
	for(byte b : inputBytes) {
		outputString += (char)b;
		
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
		
		// Test the processing time using String Builder
		startTime = System.currentTimeMillis();
		
		try {
			inputBytes = Files.readAllBytes(Paths.get(filename));		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		StringBuilder outputStringBuilder = new StringBuilder();
		for(byte c : inputBytes) {
			outputStringBuilder.append((char)c);
		}
		
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
		
		// Test the processing time using String Buffer
		startTime = System.currentTimeMillis();
		
		try {
			inputBytes = Files.readAllBytes(Paths.get(filename));		
		} catch (IOException e) {
			e.printStackTrace();
		}    
		StringBuffer outputStringBuffer = new StringBuffer();
		for(byte c : inputBytes) {
			outputStringBuffer.append((char)c);
		}	
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	  }
	}
}

