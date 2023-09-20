package application;

import java.util.Locale;
import java.util.Scanner;

public class ExeFixVet08 {

	public static void main(String[] args) {
		// Fazer um programa para ler um vetor de N números inteiros. Em seguida,
		// mostrar na tela a média
		// aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum
		// número par for
		// digitado, mostrar a mensagem "NENHUM NUMERO PAR"

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, npares = 0; double soma = 0, media;
		
		System.out.print("Quantos numeros vai ter o vetor? ");
		n = sc.nextInt();

		double[] vetor = new double[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < n; i++) {
			if (vetor[i] % 2 == 0) {
				soma = soma + vetor[i];
				npares++;
			}
		}
			if (npares == 0) {
				System.out.println("NENHUM NUMERO PAR");
			} else {
				media = soma / npares;
				System.out.printf("MEDIA DOS PARES = %.1f\n", media);
			}
	sc.close();
	}
}
		
