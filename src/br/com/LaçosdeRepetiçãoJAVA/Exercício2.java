package br.com.La�osdeRepeti��oJAVA;

import java.util.Scanner;

public class Exerc�cio2 {
	// 2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

	public static void main(String[] args) {

		int i, num, par = 0, impar = 0;

		try (Scanner leia = new Scanner(System.in)) {
			System.out.println("Digite 10 n�meros: ");

			for (i = 1; i <= 10; i++) {
				num = leia.nextInt();
				if (num % 2 != 0) {
					impar++;
				} else {
					par++;
				}
			}

			System.out.println("Voc� digitou " + par + " n�meros pares");
			System.out.println("Voc� digitou " + impar + " n�meros �mpares");

			leia.close();

		}

	}
}
