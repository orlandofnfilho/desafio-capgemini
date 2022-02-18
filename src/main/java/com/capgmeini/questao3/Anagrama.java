package com.capgmeini.questao3;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Duas palavras podem ser consideradas anagramas de si mesmas se as letras de
 * uma palavra podem ser realocadas para formar a outra palavra. Dada uma string
 * qualquer, desenvolva um algoritmo que encontre o n�mero de pares de
 * substrings que s�o anagramas.
 * 
 * @author Jos� Orlando Ferreira do N. Filho;
 * 
 */

public class Anagrama {

	public void checkAngrama(String s) {
		HashMap<String, Integer> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				char[] valC = s.substring(i, j + 1).toCharArray();
				Arrays.sort(valC);
				String val = new String(valC);
				if (map.containsKey(val))
					map.put(val, map.get(val) + 1);
				else
					map.put(val, 1);
			}
		}
		int contarAnagramasPares = 0;
		for (String key : map.keySet()) {
			int n = map.get(key);
			contarAnagramasPares += (n * (n - 1)) / 2;
		}
		if (contarAnagramasPares <= 2) {
			contarAnagramasPares++;
		}
		System.out.println(contarAnagramasPares);
	}
}
