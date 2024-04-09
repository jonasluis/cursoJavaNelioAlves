package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employye;
import entities.OutsourcedEmployye;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employye> list = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (1 + i) + " data:");
			System.out.print("Outsourced (y/n)?");
			char ch = sc.next().charAt(0);

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();

			if (ch == 'y') {
				System.out.println("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				list.add(new OutsourcedEmployye(name, hours, valuePerHour, additionalCharge));
			} else {
				list.add(new Employye(name, hours, valuePerHour));
			}
		}
		System.out.println();
		System.out.println("PAYMENTS:");
		
		for (Employye employye : list) {
			System.out.println(employye.getName() + " - $ " +  String.format("%.2f", employye.payment()));
		}

		sc.close();
	}

}
