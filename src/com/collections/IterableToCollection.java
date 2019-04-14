package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IterableToCollection {
	
	public static <T>Collection<T> getCollectionFromIterable(Iterable<T> itr){
		
		// Create an empty Collection to hold the result 
        Collection<T> cltn = new ArrayList<T>(); 
        
     // Get the iterator at the iterable 
        Iterator<T> iterator = itr.iterator();
  
        // No 1 way to do : Iterate through the iterable to add each element into the collection
        for (T t : itr) 
            cltn.add(t); 
        // No 2 way to do: iterateusing foreach
        itr.forEach(cltn :: add);
        
        // No 3 way to do: use iterator property 
        while(iterator.hasNext()) {
        	cltn.add(iterator.next());
        }
  
        // Return the converted collection 
		return cltn;
		
	}
	
	public static void main(String[] args) {
		
		Iterable<Integer> i = Arrays.asList(1, 2, 3, 4); 
        System.out.println("Iterable List : " + i); 
  
        Collection<Integer> cn = getCollectionFromIterable(i); 
        System.out.println("Collection List : " + cn); 
		
	}

}
