package application;

import java.util.Locale;
import java.util.Scanner;

public class ExeFixVet06 {

	public static void main(String[] args) {
		// faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um terceiro vetor C
		// onde cada elemento de C éa soma dos elementos correspondentes de A e B. imprima o vetor C gerado
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int n;
		System.out.print("Quantos valores vai ter cada vetor? ");
		n = sc.nextInt();
		
		System.out.println("Digite os valores do vetor A: ");
		int[] vetorA = new int[n];
		for(int i=0; i<n; i++) {
			vetorA[i] = sc.nextInt();
		}
		System.out.println("Digite os valores do vetor B: ");
		int[] vetorB = new int[n];
		for(int i=0; i<n; i++) {
			vetorB[i] = sc.nextInt();
		}
		int[] vetorC = new int[n];
		for(int i=0; i<n; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
		}
		System.out.println("VETOR RESULTANTE:");

	    for (int i=0; i<n; i++) {
	    	System.out.printf("%d\n", vetorC[i]);
	    }
		
		
		sc.close();
	}

}
