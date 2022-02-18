package com.capgmeini.questao2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Quest�o 2 -D�bora se inscreveu em uma rede social para se manter em contato
 * com seus amigos. A p�gina de cadastro exigia o preenchimento dos campos de
 * nome e senha, por�m a senha precisa ser forte. O site considera uma senha
 * forte quando ela satisfaz os seguintes crit�rios: Possui no m�nimo 6
 * caracteres. Cont�m no m�nimo 1 digito. Cont�m no m�nimo 1 letra em min�sculo.
 * Cont�m no m�nimo 1 letra em mai�sculo. Cont�m no m�nimo 1 caractere especial.
 * Os caracteres especiais s�o: !@#$%^&*()-+
 * 
 * D�bora digitou uma string aleat�ria no campo de senha, por�m ela n�o tem
 * certeza se � uma senha forte. Para ajudar D�bora, construa um algoritmo que
 * informe qual � o n�mero m�nimo de caracteres que devem ser adicionados para
 * uma string qualquer ser considerada segura.
 * 
 * 
 * @author Jos� Orlando Ferreira do N. Filho;;
 */

public class Senha {

	public int countCharacters(String password) {

		int count = 0;

		Pattern digit = Pattern.compile("(\\d)");
		Pattern upper = Pattern.compile("([A-Z])");
		Pattern lower = Pattern.compile("([a-z])");
		Pattern spChar = Pattern.compile("(\\W)");

		Matcher Digit = digit.matcher(password);
		Matcher Upper = upper.matcher(password);
		Matcher Lower = lower.matcher(password);
		Matcher Special = spChar.matcher(password);

		if (!Digit.find()) {
			count++;
		}

		if (!Upper.find()) {
			count++;
		}

		if (!Lower.find()) {
			count++;
		}

		if (!Special.find()) {
			count++;
		}

		if ((count + password.length()) < 6) {

			count = count + 6 - (count + password.length());
		}

		if (count == 0) {
			System.out.println("Password aceito!");
		}
		return count;
	}

}
