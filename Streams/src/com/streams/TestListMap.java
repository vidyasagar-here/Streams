/**
 * 
 */
package com.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author Sagar
 *
 */
public class TestListMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Hosting> list = new ArrayList<>();
		list.add(new Hosting(1,"Google","google.co.in",2000));
		list.add(new Hosting(2,"Monster","Monster.com",8000));
		list.add(new Hosting(3,"Linkedin","linkedin",1000));
		list.add(new Hosting(4,"Yahoo","yahoo.com",100));
		list.add(new Hosting(5,"Yahoo","rediff.com",10000));
		
		Map<Integer,String> list2Map = list.stream().collect(Collectors.toMap(Hosting::getId, Hosting::getName));
		
		System.out.println(list2Map);
		
		Map<String,String> keyDuplikt = list.stream().collect(Collectors.toMap(Hosting::getName, Hosting::getWebsites,(oldValue,newValue)->oldValue));
		
		System.out.println(keyDuplikt);
		
		Map<String,String> keyDuplit01 = list.stream().collect(Collectors.toMap(Hosting::getName, Hosting::getWebsites,(oldValue,newValue)->newValue));
		
		System.out.println(keyDuplit01);
		
		// order in ascending order
		
		Map sortOrder = list.stream().sorted(Comparator.comparingLong(Hosting::getCost).reversed())
				.collect(Collectors.toMap(Hosting::getName,Hosting::getWebsites,(oldValue,newValue)->oldValue,LinkedHashMap::new));
		
		System.out.println(sortOrder);

	}

}
