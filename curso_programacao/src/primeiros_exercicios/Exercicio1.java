package primeiros_exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// Faça um programa para ler dois valores inteiros,
		//e depois mostrar na tela a soma desses números com uma 
		//mensagem explicativa, conforme exemplos.
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int soma = a + b;
		
		System.out.println("Resultado: " + soma);
		
		
		
		

        sc.close();
	}

}
