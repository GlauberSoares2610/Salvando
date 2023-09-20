package primeiros_exercicios;


import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		//Fazer um programa para ler o código de uma peça 1,
		//o número de peças 1, o valor unitário de cada peça 1,
		//o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
		//Calcule e mostre o valor a ser pago
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		double c1 = sc.nextDouble();
		double q1 = sc.nextDouble();
		double v1 = sc.nextDouble();
		double c2 = sc.nextDouble();
		double q2 = sc.nextDouble();
		double v2 = sc.nextDouble();
		
		double v;
		c1 = q1 * v1;
		c2 = q2 * v2;
		v = c1 + c2;
		
		
		System.out.printf("Total: R$ %.2f%n", v);
		
		
		
		
		
		sc.close();
       
	}

}
