package br.com.La�osdeRepeti��oJAVA;

import java.util.Scanner;

public class Exerc�cio6 {
	/*
	 * 6- Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
	 * final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
	 * 0(zero).(DO...WHILE)
	 */

	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);

		int soma = 0, numero;
		double media;

		do {
			System.out.println("Digite um n�mero: ");
			numero = l.nextInt();

			if (numero % 3 == 0) {
				soma = soma + numero;
			}

		} while (numero != 0);
		media = soma / 2;

		System.out.println("A m�dia dos n�meros �: " + media);

		l.close();

	}

}
