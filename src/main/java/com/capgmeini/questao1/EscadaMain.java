package com.capgmeini.questao1;

import java.util.Scanner;

/**
 * Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o
 * caractere * e espaços. A base e altura da escada devem ser iguais ao valor de
 * n. A última linha não deve conter nenhum espaço.
 *
 * @author José Orlando Ferreira do N. filho
 */
public class EscadaMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o tamanho da escada: ");
		int n = sc.nextInt();

		try {
			Escada escada = new Escada();
			escada.construirEscada(n);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		sc.close();

	}
}
