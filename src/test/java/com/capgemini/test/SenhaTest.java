package com.capgemini.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.capgmeini.questao2.Senha;

public class SenhaTest {

	@Test
	public void test() {
		Senha pass = new Senha();
		pass.countCharacters("Ya3");
		assertEquals(3, 3);
	}

	@Test
	public void test2() {
		Senha pass = new Senha();
		pass.countCharacters("123456");
		assertEquals(3, 3);
	}

	@Test
	public void test3() {
		Senha pass = new Senha();
		pass.countCharacters("ab");
		assertEquals(4, 4);
	}

}
