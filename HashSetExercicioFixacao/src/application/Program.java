package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int number = sc.nextInt();
			a.add(number);
		}
		System.out.print("How many students for course B? ");
		N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int number = sc.nextInt();
			b.add(number);
		}
		System.out.print("How many students for course C? ");
		N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int number = sc.nextInt();
			c.add(number);
		}
		
		a.addAll(b);
		a.addAll(c);
		System.out.println("Total students: " + a.size());
		sc.close();
	}

}
