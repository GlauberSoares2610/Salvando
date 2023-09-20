package Application;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuintes;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Exercicio {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuintes> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Renda Anual: ");
			double rendaAnual = sc.nextDouble();
			if (type == 'i') {
				System.out.print("Gastos com Saude: ");
				double gastosSaude = sc.nextDouble();
				list.add(new PessoaFisica(name, rendaAnual, gastosSaude));
			}
			else {
				System.out.print("Number of employees: ");
				int nFuncionarios = sc.nextInt();
				list.add(new PessoaJuridica(name, rendaAnual, nFuncionarios));
			}
		}

		double sum = 0.0;
		System.out.println();
		System.out.println("TAXES PAID:");
		for (Contribuintes con : list) {
			double taxa = con.taxa();
			System.out.println(con.getName() + ": $ " + String.format("%.2f", taxa));
			sum += taxa;
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		
		sc.close();
	}
}