package quarta_lista_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido1 {

	public static void main(String[] args) {
		//Leia 1 valor inteiro N (2<N<1000). A seguir, mostre a tabuada de N:
		// 1 x N = N, 2 x N = 2N .... 10 x N = 10N
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i=1; i<=10; i++) {
			int produto = i * N;
			System.out.println(i + " x " + N + " = " + produto);
			}
		
		
		sc.close();
	}

}
