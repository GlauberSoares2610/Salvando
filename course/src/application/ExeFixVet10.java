package application;

import java.util.Locale;
import java.util.Scanner;

public class ExeFixVet10 {

	public static void main(String[] args) {
		// Fazer um programa para ler um conjunto de N nomes de alunos, bem como as
		// notas que eles tiraram
		// no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um
		// vetor. Depois, imprimir
		// os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das
		// notas seja maior ou
		// igual a 6.0 (seis).

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		double media;

		System.out.print("Quantos alunos serao digitados? ");
		n = sc.nextInt();

		String[] nome = new String[n];
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %dº aluno:\n", i + 1);
			nome[i] = sc.next();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
		}
		
		System.out.println("Alunos Aprovados: ");
		
		for (int i = 0; i < n; i++) {
			media = (nota1[i] + nota2[i]) / 2;

			if (media >= 6.0) {
				System.out.printf("%s\n", nome[i]);
			}
		}
		
		sc.close();
	}

}
