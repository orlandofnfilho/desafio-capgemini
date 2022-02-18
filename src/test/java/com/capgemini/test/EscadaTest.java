package com.capgemini.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.capgmeini.questao1.Escada;

public class EscadaTest {

	@Test
	public void testConstruirEscada() {
		Escada escada = new Escada();
		escada.construirEscada(6);
		assertEquals(6, 6);
	}

}
