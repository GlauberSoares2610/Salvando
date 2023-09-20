package quarta_lista_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		//Ler um valor N. Calcular e escrever seu respectivo fatorial.
		//Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
		//Lembrando que, por definição, fatorial de 0 é 1.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int pot = 1;
		
		for(int i=1; i<=n; i++) {
			pot = pot * i;
		}
		System.out.println(pot);
		
		sc.close();
	}

}
