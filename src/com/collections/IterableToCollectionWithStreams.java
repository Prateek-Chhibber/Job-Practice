package com.collections;

import java.util.*; 
import java.util.stream.*;

public class IterableToCollectionWithStreams {

	public static <T> Collection<T> 
	getCollectionFromIteralbe(Iterable<T> itr) 
	{ 
		// Create an empty Collection to hold the result 
		Collection<T> cltn = new ArrayList<T>(); 

		cltn =  StreamSupport.stream(itr.spliterator(), false) 
				.collect(Collectors.toList()); 
		
		return cltn;
	}

	public static void main(String[] args) {
		
		Iterable<Integer> i = Arrays.asList(1, 2, 3, 4); 
        System.out.println("Iterable List : " + i); 
        
        Iterable<Character> st = Arrays.asList('a','s','d' );
        System.out.println("Iterable List : " +st);
  
        Collection<Integer> cn = getCollectionFromIteralbe(i); 
        System.out.println("Collection List : " + cn); 

	}

}
