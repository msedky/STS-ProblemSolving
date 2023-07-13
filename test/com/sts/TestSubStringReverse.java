package com.sts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSubStringReverse {

	SubStringReverser subStringReverser = new SubStringReverser();

	/* Test input = "abd(jnb)asdf" */
	@Test
	void testInput1() {
		String input = "abd(jnb)asdf";
		String result = subStringReverser.reverse(input);
		assertEquals(result, "abd(bnj)asdf");
	}

	/* Test input = "abdjnbasdf" */
	@Test
	void testInput2() {
		String input = "abdjnbasdf";
		String result = subStringReverser.reverse(input);
		assertEquals(result, "abdjnbasdf");
	}

	/* Test input = "dd(df)a(ghhh)" */
	@Test
	void testInput3() {
		String input = "dd(df)a(ghhh)";
		String result = subStringReverser.reverse(input);
		assertEquals(result, "dd(fd)a(hhhg)");
	}

	/* Test Unbalanced Parantheses with input = "(dbyv)s)" */
	@Test
	void testUnBalancedParantheses1() {
		assertThrows(RuntimeException.class, ()->{
			String input = "(dbyv)s)";
			String result = subStringReverser.reverse(input);
		});
	}
	
	/* Test Unbalanced Parantheses with input = "(a)(abmnjus)s" */
	@Test
	void testUnBalancedParantheses2() {
		assertThrows(RuntimeException.class, ()->{
			String input = "(a(abmnjus)s)";
			String result = subStringReverser.reverse(input);
		});
	}

}
