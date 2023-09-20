package application;

import java.util.Locale;
import java.util.Scanner;

public class ExeFixVet01 {

	public static void main(String[] args) {
		// Faça um programa que leia um numero inteiro positivo N (maximo = 10 e depois N numeros inteiros e armazene-os em um vetor.
		// Em seguida, mostrar na tela todos os numeros negativos lidos.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int N = sc.nextInt();
		int[] vetor = new int[N];
		
		for (int i=0; i<N; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		for (int i=0; i<N; i++) {
	        if (vetor[i] < 0) {
	        	System.out.printf("%d\n", vetor[i]);
	        }
		}
		sc.close();
	}
}