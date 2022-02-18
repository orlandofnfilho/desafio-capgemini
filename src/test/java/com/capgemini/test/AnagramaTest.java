package com.capgemini.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgmeini.questao3.Anagrama;

public class AnagramaTest {

	@Test
	public void test() {
		Anagrama anagram = new Anagrama();
		anagram.checkAngrama("ovo");
		assertEquals(3, 3);
	}

	@Test
	public void test2() {
		Anagrama anagram = new Anagrama();
		anagram.checkAngrama("ifailuhkqq");
		assertEquals(3, 3);
	}

}
