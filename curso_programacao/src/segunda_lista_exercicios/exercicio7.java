package segunda_lista_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		//Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas 
		//de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o 
		//ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if(x > 0 && y > 0) {
			System.out.printf("Quadrante 1");
		}
		else if (x < 0 && y > 0) {
			System.out.printf("Quadrante 2");
		}
		else if (x < 0 && y < 0) {
			System.out.printf("Quadrante 3");
		}
		else if (x > 0 && y < 0) {
			System.out.printf("Quadrante 4");		
		}
		else {
			System.out.println("Origem");
		}
		sc.close();
	}

}
