package br.com.VetoreseMatrizesJAVA;

import java.util.Scanner;

public class Exercício4 {
	/*
	 * Exercícios com Vetores[ ] e Matrizes [ ][ ] 4. Crie um programa que receba
	 * valores do usuário para preencher uma matriz 3X3, e em seguida, exiba a soma
	 * dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal
	 * principal.
	 */

	public static void main(String[] args) {
		int mat[][] = new int[3][3];
		int l, c, soma = 0, s = 0;
		Scanner ler = new Scanner(System.in);

		for (l = 0; l < 3; l++) {
			for (c = 0; c < 3; c++) {
				System.out.print("Insira um valor : ");
				mat[l][c] = ler.nextInt();
			}

		}

		for (l = 0; l < 3; l++) {
			for (c = 0; c < 3; c++) {
				soma = soma + mat[l][c];
			}

		}
		System.out.println("\nA soma dos valores é:  " + soma);

		for (l = 0; l < 3; l++) {
			for (c = 0; c < 3; c++) {
				s = mat[0][0] + mat[l][l] + mat[2][2];
			}

		}

		System.out.println("\nA soma dos valores da primeira diagonal é : " + s);

	}

}
