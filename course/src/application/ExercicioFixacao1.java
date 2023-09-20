package application;

import java.util.Locale;
import java.util.Scanner;

import entities.retangulo;

public class ExercicioFixacao1 {

	public static void main(String[] args) {
		// Fazer um programa para ler os valores da largura e altura de um retangulo.
		//Em seguida, mostrar na tela o valor de sua area, perimetro e diagonal.
		//Usar uma classe como mostrado no projeto ao lado.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		retangulo retangulo = new retangulo();
		System.out.println("Enter rectangle width and height: ");
		retangulo.altura = sc.nextDouble();
		retangulo.largura = sc.nextDouble();
		
		System.out.printf("Area = %.2f%n",  retangulo.area());
		System.out.printf("Perimetro = %.2f%n", retangulo.perimetro());
		System.out.printf("Diagonal = %.2f%n", retangulo.diagonal());
						
		sc.close();
	}

}
