package quarta_lista_exercicios;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro positivo N.
		//O programa deve então mostrar na tela N linhas, começando de 1 até N.
		//Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme 
		//exemplo.
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		
		for (int i=1; i<=N; i++) {
			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
		}
		
		
		sc.close();
	}

}