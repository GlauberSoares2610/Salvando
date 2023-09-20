package application;

import java.util.Locale;
import java.util.Scanner;

public class ExeFixVet09 {

	public static void main(String[] args) {
		// Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes 
		//devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome 
		//da pessoa mais velha. 
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		int maiorIdade, posicaoMaior;
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.printf("Dados da %d ª pessoa:\n ", i + 1);
			System.out.print("Nome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
		}
		maiorIdade = idade[0];
	    posicaoMaior = 0;
		
	    for (int i=1; i<n; i++) {
	        if (idade[i] > maiorIdade) {
	            maiorIdade = idade[i];
	            posicaoMaior = i;
	        }
	    }

	    System.out.printf("PESSOA MAIS VELHA: %s\n", nome[posicaoMaior]);
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
