package com.capgmeini.questao2;

import java.util.Scanner;

public class SenhaMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Senha pass = new Senha();
		System.out.println("Entre com a senha: ");
		String entrada = sc.nextLine();
		System.out.println(pass.countCharacters(entrada));
		sc.close();

	}

}
