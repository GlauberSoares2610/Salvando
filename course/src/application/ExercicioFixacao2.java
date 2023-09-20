package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ficha;

public class ExercicioFixacao2 {

	public static void main(String[] args) {
		// Fazer um programa para ler os dados de um funcionário(nome, salário bruto e imposto). em seguida, mostrar os dados
		// do funcionário(nome, salário liquido). Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada
		// (somente o salário bruto é afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe projetada.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ficha ficha = new ficha();
		System.out.print("Name: ");
		ficha.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		ficha.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		ficha.tax = sc.nextDouble();
		System.out.println();
		System.out.println("Employee: " + ficha);
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double porcentage = sc.nextDouble();
		ficha.increaseSalary(porcentage);
		System.out.println();
		System.out.printf("Update data: " + ficha);
		
		
		
		
		sc.close();
	}

}
