
// Hoàng Văn Kiên - 20205089
package hust.soict.dsai.garbage;

import java.util.Random;

public class ConcatenationInLoops {
	public static void main(String[] args) {
		// Test the processing time using + opertator
		Random r = new Random(123);
		long start = System.currentTimeMillis();
		String s = "";
		for(int i = 0 ; i < 65536 ;i++) {
			 s += r.nextInt(2);
		}
		System.out.println(System.currentTimeMillis() - start); //This prints roughly 1500
		
		// Test the processing time using StringBuffer 
		r = new Random(123);
		start = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer();
		for(int i = 0 ; i < 65536 ;i++) {
			sb.append(r.nextInt(2));
		}
		s = sb.toString();
		System.out.println(System.currentTimeMillis() - start); // This prints roughly 5
		
		// Test the processing time using StringBuilder
		r = new Random(123);
		start = System.currentTimeMillis();
		StringBuilder sb1 = new StringBuilder();
		for(int i = 0 ; i < 65536 ;i++) {
			sb1.append(r.nextInt(2));
		}
		s = sb1.toString();
		System.out.println(System.currentTimeMillis() - start); //This prints roughly 3
		
	}
}
