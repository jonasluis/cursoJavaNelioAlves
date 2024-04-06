import java.util.Scanner;

public class MaisVelho {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();

		String nome[] = new String[n];
		int idade[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
		}

		int maiorIdade = idade[0];
		int maisVelho = 0;

		for (int i = 0; i < idade.length; i++) {
			if (idade[i] < maiorIdade) {
				maiorIdade = idade[i];
				maisVelho++;
			}
		}

		System.out.printf("PESSOA MAIS VELHA: %s\n", nome[maisVelho]);

		sc.close();
	}

}
