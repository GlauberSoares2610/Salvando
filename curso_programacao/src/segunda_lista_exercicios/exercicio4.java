package segunda_lista_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		//Leia a hora inicial e a hora final de um jogo.
		//A seguir calcule a duração do jogo, sabendo que o mesmo pode 
		//começar em um dia e terminar em outro, tendo uma duração mínima
		//de 1 hora e máxima de 24 horas.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int hora1 = sc.nextInt();
		int hora2 = sc.nextInt();
		int duracao;
		
		if (hora1 < hora2 ) {
			duracao = hora2 - hora1;
			
		}
		else{
			duracao = 24 - hora1 + hora2;
		}
		System.out.printf("O jogo durou %d horas", duracao);
		
		
		
		
		
		
		sc.close();

	}

}
