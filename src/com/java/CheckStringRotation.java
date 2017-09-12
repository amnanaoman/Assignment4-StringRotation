package com.java;

public class CheckStringRotation {

	public static void main(String[] args) {
		
		String s1 = "abcdae";
		String s2 = "cdaeabssss";
		Boolean rotation = rotation(s1,s2);
		if(rotation){
			System.out.println("Strings are rotation of each other");
		}
		else{
			System.out.println("Strings are not rotation of each other");
				
		}
		

	}
	public static Boolean rotation (String s1, String s2){
		
		if(s1.length()!=s2.length()){
			return false;
		}
		else{

			String concats1 = s1.concat(s1);
			if(concats1.contains(s2))

				return true;
			else
				return false;
		}
	}
}
