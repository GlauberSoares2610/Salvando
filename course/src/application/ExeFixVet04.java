package application;

import java.util.Locale;
import java.util.Scanner;

public class ExeFixVet04 {

	public static void main(String[] args) {
		// Faça um programa que leia N numeros inteiros e armazene-os em um vetor. em seguida, mostre na tela todos os numeros pares
		// e também a quantidade de numeros pares.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, qtdpares;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		int[] vetor = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();	
		}
		System.out.println("\nNumeros Pares:");
		
		qtdpares = 0;
		for (int i=0; i<n; i++) {
			if(vetor[i] % 2 == 0) {
				System.out.printf("%d  ", vetor[i]);
	            qtdpares++;
			}
		}
		
		System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", qtdpares);
		
		
		sc.close();
	}

}
