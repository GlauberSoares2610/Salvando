package quarta_lista_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// Fazer um programa para ler um número N.
		//Depois leia N pares de números e mostre a divisão do primeiro pelo segundo.
		//Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel"
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			if(y!=0) {
				double divisao = x/y;
				System.out.println(divisao);
			}
			else {
				System.out.println("Divisao Impossivel");
			}
		}
		
		sc.close();
	}

}
