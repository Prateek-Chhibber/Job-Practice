package com.string.ques;

public class RemoveZeroFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "00000125969";
		int i = 0;
		while (input.charAt(i)== '0') {
			i++;
		}
		System.out.println(i);
		StringBuffer sb = new StringBuffer(input);
		sb.replace(0, i, "");
		String a = sb.toString();
		System.out.println("After removing zero's : "+a);
	}

}
