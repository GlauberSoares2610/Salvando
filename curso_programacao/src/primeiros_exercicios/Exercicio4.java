package primeiros_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas,
		//o valor que recebe por hora e calcula o salário desse funcionário. 
		//A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
        
	    Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int H = sc.nextInt();
		double V = sc.nextDouble();
		double S;
		
		S = H * V;
		
		System.out.println("Numero: " + N);
		System.out.printf("Salario: %.2f%n", S);
		
		
		
		sc.close();
	}

}
