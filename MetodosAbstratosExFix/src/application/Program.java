package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.NaturalPerson;
import entities.Taxpayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Taxpayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Tax payer #" + (1  + i) + " data:");
			System.out.print("Individual or company (n/l)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double annualIncome = sc.nextDouble();
			
			if (type == 'n') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new NaturalPerson(name, annualIncome, healthExpenditures));
			} else {
				System.out.print("Number of employees:  ");
				int numberOfEmployees = sc.nextInt();
				list.add(new LegalPerson(name, annualIncome, numberOfEmployees));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		for (Taxpayer taxpayer : list) {
			System.out.println(taxpayer.getName() + ": $ " + String.format("%.2f", taxpayer.tax()));
		}
		
		double sum = 0.0;
		for (Taxpayer taxpayer : list) {
			sum += taxpayer.tax();
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		
		sc.close();
	}

}
