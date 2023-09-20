package primeiros_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C.
		// Em seguida, calcule e mostre: 
		//	a) a área do triângulo retângulo que tem A por base e C por altura. 
		//	b) a área do círculo de raio C. (pi = 3.14159) 
		//	c) a área do trapézio que tem A e B por bases e C por altura. 
		//	d) a área do quadrado que tem lado B. 
	    //	e) a área do retângulo que tem lados A e B.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double pi = 3.14159;
		double triangulo_ret, circulo, trapezio, quadrado, retangulo;
		
		
		triangulo_ret = A * C / 2;
		circulo = pi * C * C;
		trapezio = (A + B) * C / 2;
		quadrado = B * B;
		retangulo = A * B;
		
		System.out.printf("Triangulo RET: %.3f%n", triangulo_ret);
		System.out.printf("Circulo: %.3f%n", circulo);
		System.out.printf("Trapezio: %.3f%n", trapezio);
		System.out.printf("Quadrado: %.3f%n", quadrado);
		System.out.printf("Retangulo: %.3f%n", retangulo);
		
		
		
		
		
		
		
		
        sc.close();
	}

}
