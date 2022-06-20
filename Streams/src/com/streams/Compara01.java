/**
 * 
 */
package com.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author Sagar
 *
 */
public class Compara01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Hosting> list = getData();
		
		list.sort((h1,h2)->h1.getName().compareTo(h2.getName()));
		list.forEach((hosting)->System.out.println(hosting));
	}
	
	public static List<Hosting> getData(){
		List<Hosting> list = new ArrayList<>();
		list.add(new Hosting(1,"Google","google.co.in",10000));
		list.add(new Hosting(2,"Linkedin","Linkedin.co.in",8000));
		list.add(new Hosting(3,"Rediff","Rediff.co.in",5000));
		list.add(new Hosting(4,"Naukri","Naukri.co.in",2000));
		list.add(new Hosting(5,"yahoo","yahoo.co.in",100));
		return list;
	}

}
