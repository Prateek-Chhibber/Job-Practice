package com.string.ques;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "Geeksforgeeks";
		char[] tmparray = input.toCharArray();
		ArrayList<Character> list1 = new ArrayList<Character>();
		for(char c:tmparray) 
			list1.add(c);
		
		Collections.reverse(list1);
		ListIterator li = list1.listIterator();
		while (li.hasNext()) {
			System.out.print(li.next());			
		}
	
	}

}
