package com.capgmeini.questao3;

import java.util.Scanner;

/**
 * Duas palavras podem ser consideradas anagramas de si mesmas se as letras de
 * uma palavra podem ser realocadas para formar a outra palavra. Dada uma string
 * qualquer, desenvolva um algoritmo que encontre o número de pares de
 * substrings que são anagramas.
 * 
 * @author José Orlando Ferreira do N. Filho
 */

public class AnagramaMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Anagrama anagram = new Anagrama();
		String str = "";
		System.out.println("Entre a string: ");
		str = sc.nextLine();
		anagram.checkAngrama(str);
		sc.close();

	}

}
