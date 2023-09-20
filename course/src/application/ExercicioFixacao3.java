package application;

import java.util.Locale;
import java.util.Scanner;

import entities.student;

public class ExercicioFixacao3 {

	public static void main(String[] args) {
		// FAZER UM PROGRAMA PARA LER O NOME DE UM ALUNO E AS TRÊS NOTAS QUE ELE OBTEVE NOS TRÊS TRIMESTRES DO ANO (PRIMEIRO VALE 30
		// E O SEGUNDO E TERCEIRO VALEM 35 CADA). AO FINAL, MOSTRAR QUAL A NOTA FINAL DO ALUNO NO ANO. DIZER TAMBÉM SE O ALUNO
		// ESTÁ APROVADO (PASS) OU NÃO (FAILED) E, EM CASO NEGATIVO, QUANTOS PONTOS FALTAM PARA O ALUNO OBTER O MINIMO PARA SER
		// APROVADO (QUE É 60% DA NOTA). VOCÊ DEVE CRIAR UMA CLASSE STUDENT PARA RESOLVER O PROBLEMA.
		
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		student student = new student();
		System.out.print("Name: ");
		student.name = sc.nextLine();
		System.out.println("Digite as notas: ");
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();
		System.out.printf("Final Grade: %.2f%n ", student.media());
		
		if (student.media() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
			}
			else {
			System.out.println("PASS");
			}
		
		
		
		
		
		sc.close();
	}

}
