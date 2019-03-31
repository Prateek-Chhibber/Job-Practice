package com.string.ques;

import java.util.HashMap;
import java.util.Map;

public class Dups {
	static String s = "VCORP CONSULTING PVT LTD";

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int i;
        Map<Character, Integer> hm = new HashMap();
        for(i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
            }
            else{
                hm.put(s.charAt(i),1);
            }
        }
        
         for (Character c : hm.keySet()) { 
             if(hm.get(c) ==1 )
                System.out.println("key: value -> " + c +": "+ hm.get(c) ); 
         }
    }
}
