package com.sts;

public class SubStringReverseMain {

	public static void main(String[] args) {
		SubStringReverser subStringReverser = new SubStringReverser();

		String input = "abd(jnb)asdf";
		String result = subStringReverser.reverse(input);
		System.out.println("input '" + input + "'   results '" + result + "'");
		
		
		input = "abdjnbasdf";
		result = subStringReverser.reverse(input);
		System.out.println("input '" + input + "'   results '" + result + "'");
		
		
		input = "dd(df)a(ghhh)";
		result = subStringReverser.reverse(input);
		System.out.println("input '" + input + "'   results '" + result + "'");
		
		
		input = "(a)(abmnjus)s";
		result = subStringReverser.reverse(input);
		System.out.println("input '" + input + "'   results '" + result + "'");
	}

}
