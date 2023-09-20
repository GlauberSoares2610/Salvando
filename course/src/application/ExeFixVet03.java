package application;

import java.util.Locale;
import java.util.Scanner;

public class ExeFixVet03 {

	public static void main(String[] args) {
		// fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na tela a altura media
		// das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos, bem como os nomes dessas pessoas caso houver.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, nmenores;
		double altura, media, porcentagemMenores;
		
		System.out.print("Quantas pessoas serão digitadas? ");
		n = sc.nextInt();
		
		String[] nomes = new String[n];
	    int[] idades = new int[n];
	    double[] alturas = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("Dados da %dª Pessoa: \n", i + 1);
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();
		}
		

		nmenores = 0;
		altura = 0;
	    for (int i=0; i<n; i++) {
	        if (idades[i] < 16) {
	            nmenores++;
	        }
	        altura = altura + alturas[i];
	    }

	    media = altura / n;
	    porcentagemMenores = ((double)nmenores / n) * 100.0;

	    System.out.printf("\nAltura media = %.2f\n", media);
	    System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagemMenores);

	    for(int i=0; i<n; i++) {
	        if (idades[i] < 16) {
	        	System.out.printf("%s\n", nomes[i]);
	        }
	    }
		
		sc.close();
	}

}
