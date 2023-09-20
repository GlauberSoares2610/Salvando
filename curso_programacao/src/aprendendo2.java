import java.util.Scanner;

public class aprendendo2 {

	public static void main(String[] args) {
		// if else composta
		
		Scanner sc = new Scanner(System.in);
		int hora;

		System.out.println("Quantas horas? ");
		hora = sc.nextInt();
		
		if(hora < 12) { 
		    System.out.println("Bom dia");
		}
		else {
		System.out.println("Boa tarde");
		}
		
		sc.close();

	}
           
	
}
        