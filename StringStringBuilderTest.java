package com.amit;

public class StringStringBuilderTest {

	public static void main(String[] args) {

	String s="Amit"	;
	String s1="pat";
	
	String s2 =new String("pat");
	s2.intern();
	StringBuffer sb = new StringBuffer("Amit");
	StringBuilder sb1 = new StringBuilder("Amit");
	
	System.out.println(s =sb.toString());
	System.out.println(s =sb1.toString());
	
	System.out.println(s1==s2);
		
	}

}
