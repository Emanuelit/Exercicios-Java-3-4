package br.com.La�osdeRepeti��oJAVA;

import java.util.Scanner;

public class Exerc�cio5 {
	/*
	 * 5- Crie um programa que leia um n�mero do teclado at� que encontre um n�mero
	 * igual a zero. No final, mostre a soma dos n�meros digitados.(DO...WHILE)
	 */

	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);
		int numero, soma = 0;

		do {
			System.out.print("Digite o n�mero: ");
			numero = leia.nextInt();
			soma = soma + numero;
		} while (numero != 0);

		System.out.println("Acertou! ");
		System.out.println("A soma dos n�meros digitados � de: " + soma);

		leia.close();

	}

}
