package br.com.VetoreseMatrizesJAVA;

import java.util.Scanner;

public class Exerc�cio1 {
	/*
	 * Exerc�cios com Vetores[ ] e Matrizes [ ][ ] 1. Fa�a um programa que crie um
	 * vetor por leitura com 5 valores de pontua��o de uma atividade e o escreva em
	 * seguida. Encontre ap�s a maior pontua��o e a apresente.
	 */

	public static void main(String[] args) {

		int vet[] = new int[5], maior = 0, x, pontuacao;

		for (x = 0; x < 5; x++) {

			System.out.println("Digite uma pontua��o : ");
			Scanner leia = new Scanner(System.in);
			vet[x] = leia.nextInt();
		}
		for (x = 0; x < 5; x++) {

			if (vet[x] > maior) {

				maior = vet[x];
			}

		}
		System.out.println("O maior valor � " + maior);

	}

}
