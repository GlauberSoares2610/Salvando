package application;

import java.util.Locale;
import java.util.Scanner;

public class ExeFixVet02 {

	public static void main(String[] args) {
		// Faça um programa que leia N numeros reais e armazene-os em um vetor. Em seguida:
		// - imprimir todos os elementos do vetor
		// - Mostrar na tela a soma e a média dos elementos do vetor
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n;
		double soma, media;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		double[] vetor = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		soma = 0;
		for (int i=0; i<n; i++) {
			soma = soma + vetor[i];
		}
		media = soma / n;

		System.out.print("VALORES = ");

	    for (int i=0; i<n; i++) {
	    	System.out.printf("%.1f  ", vetor[i]);
	    }

	    System.out.printf("\nSOMA = %.2f\n", soma);
	    System.out.printf("MEDIA = %.2f\n", media);
		
		
		
		
		sc.close();
	}

}
