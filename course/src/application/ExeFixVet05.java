package application;

import java.util.Locale;
import java.util.Scanner;

public class ExeFixVet05 {

	public static void main(String[] args) {
		// faça um programa que leia N numeros reais e armazene-os em um vetor. em seguida, mostrar na tela o maior numero do vetor
		// (supor não haver empates). mostrar também a posição do maior elemento, considerando a primeira posição como 0 (zero).
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int n, PMvalor;
		double Mvalor;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		
		Mvalor = vetor[0];
		PMvalor = 0;
		
		for (int i=1; i<n; i++) {
			if (vetor[i] > Mvalor) {
				Mvalor = vetor[i];
				PMvalor = i;
			}
		}
		System.out.printf("MAIOR VALOR = %.1f\n", Mvalor);
	    System.out.printf("POSICAO DO MAIOR VALOR = %d\n", PMvalor);
		
		sc.close();
	}

}
