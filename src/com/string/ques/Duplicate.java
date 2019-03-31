package com.string.ques;

import java.util.HashMap;
import java.util.Map;

public class Duplicate {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "VCORP CONSULTING PVT LTD";
		Map<Character, Integer> hm = new HashMap<Character, Integer>();
		char []stringtoCharArray = s.toCharArray();
		int count = 0;
		
		for(char output : stringtoCharArray) {
			//System.out.println(output);
			hm.put(output, count);
		}
		
		System.out.println(hm);

	}

}
