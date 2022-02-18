package com.capgmeini.questao3;

import java.util.Scanner;

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
