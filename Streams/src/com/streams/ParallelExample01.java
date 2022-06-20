/**
 * 
 */
package com.streams;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sagar
 *
 */
public class ParallelExample01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		/*
		 * IntStream range = IntStream.rangeClosed(1, 10);
		 * range.forEach(System.out::println);
		 * 
		 * System.out.println(" *** ");
		 * 
		 * IntStream range2 = IntStream.rangeClosed(1, 10);
		 * range2.parallel().forEach(System.out::println);
		 */
		List<String> alpha = getData();
		//alpha.stream().forEach(System.out::println);
		alpha.parallelStream().forEach(System.out::println);
	}
	
	private static List<String> getData(){
		List<String> alpha = new ArrayList<String>();
		int n=97;
		while(n<=122) {
			alpha.add(String.valueOf((char)n));
			n++;
		}
		return alpha;
	}
}
