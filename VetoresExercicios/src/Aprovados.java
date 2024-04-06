import java.util.Locale;
import java.util.Scanner;

public class Aprovados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		String nome[] = new String[n];
		double nota1[] = new double[n];
		double nota2[] = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i + 1);
			sc.nextLine();
			nome[i] = sc.nextLine();
			nota1[i] = sc.nextDouble();		
			nota2[i] = sc.nextDouble();
		}
		
		 System.out.println("Alunos aprovados:");
		 
		 double media = 0;
		
		for (int i = 0; i < nota2.length; i++) {
			media = (nota1[i] + nota2[i]) / 2;
			if (media >= 6.0) {
				System.out.printf("%s\n", nome[i]);
			}
		}
		
		
		sc.close();

	}

}
