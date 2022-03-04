package br.com.VetoreseMatrizesJAVA;

import java.util.Scanner;

public class Exercício1 {
	/*
	 * Exercícios com Vetores[ ] e Matrizes [ ][ ] 1. Faça um programa que crie um
	 * vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em
	 * seguida. Encontre após a maior pontuação e a apresente.
	 */

	public static void main(String[] args) {

		int vet[] = new int[5], maior = 0, x, pontuacao;

		for (x = 0; x < 5; x++) {

			System.out.println("Digite uma pontuação : ");
			Scanner leia = new Scanner(System.in);
			vet[x] = leia.nextInt();
		}
		for (x = 0; x < 5; x++) {

			if (vet[x] > maior) {

				maior = vet[x];
			}

		}
		System.out.println("O maior valor é " + maior);

	}

}
