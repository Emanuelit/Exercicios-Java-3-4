package br.com.LaçosdeRepetiçãoJAVA;

import java.util.Scanner;

public class Exercício2 {
	// 2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

	public static void main(String[] args) {

		int i, num, par = 0, impar = 0;

		try (Scanner leia = new Scanner(System.in)) {
			System.out.println("Digite 10 números: ");

			for (i = 1; i <= 10; i++) {
				num = leia.nextInt();
				if (num % 2 != 0) {
					impar++;
				} else {
					par++;
				}
			}

			System.out.println("Você digitou " + par + " números pares");
			System.out.println("Você digitou " + impar + " números ímpares");

			leia.close();

		}

	}
}
