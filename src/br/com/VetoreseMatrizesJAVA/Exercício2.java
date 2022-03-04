package br.com.VetoreseMatrizesJAVA;

import java.util.Random;

public class Exercício2 {
	/*
	 * Exercícios com Vetores[ ] e Matrizes [ ][ ] 2. Um dado é lançado 10 vezes e o
	 * valor correspondente é anotado. Faça um programa que gere um vetor com os
	 * lançamentos, escreva esse vetor. A seguir determine e imprima a média
	 * aritmética dos lançamentos, contabilize e apresente também quantas foram as
	 * ocorrências da maior pontuação.
	 */

	public static void main(String[] args) {
		Random random = new Random();

		int [] vetor = new int[10];
		int l, media = 0, maior = 0;

		for(l = 0; l < 10; l++) {
			vetor[l] = random.nextInt(6) + 1;
			media = media + vetor[l];
			if(vetor[l] == 6) {
				maior += 1;
			}
		}
		for(l = 0;l < 10;l++) {
			System.out.println(vetor[l] + ", ");
		}

		media = media/10;
		System.out.println("A media das 10 jogadas do dado : " + media);
		System.out.println("A maior pontuação do dado (6) ocorreu " + maior + " vezes");
				}
			
}
	}


