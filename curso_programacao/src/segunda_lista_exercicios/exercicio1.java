package segunda_lista_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		//Fazer um programa para ler um número inteiro, e depois dizer se este número
		//é negativo ou não.
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		int x = sc.nextInt();
		
		if( x>=0 ) {
			System.out.println("É POSITIVO");
		}
		else {
			System.out.println("É NEGATIVO");
		}
		
		
		
		
		
		
		
		
		sc.close();

	}

}
