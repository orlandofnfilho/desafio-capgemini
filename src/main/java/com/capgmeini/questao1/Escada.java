package com.capgmeini.questao1;

import java.util.Arrays;

public class Escada {

	public void construirEscada(int n) {

		if (n < 1) {
			throw new NumberFormatException("Tamanho da escada inválido");
		} else {
			char[] deg = new char[n];
			Arrays.fill(deg, ' ');

			for (int i = deg.length - 1; i >= 0; i--) {
				deg[i] = '*';
				System.out.print(deg);
				if (i > 0)
					System.out.println();
			}

		}

	}

}
