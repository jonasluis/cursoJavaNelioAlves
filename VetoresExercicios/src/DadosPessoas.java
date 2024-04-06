import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();

		double altura[] = new double[n];
		char genero[] = new char[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Altura da %da pessoa:\n", i + 1);
			altura[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa:\n", i + 1);
			genero[i] = sc.next().charAt(0);
		}

		double menorAltura = altura[0];
		double maiorAltura = altura[0];
		for (int i = 0; i < genero.length; i++) {
			if (altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}
			if (altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
		}

		int homens = 0;
		int mulheres = 0;
		double alturaTotalMulheres = 0;

		for (int i = 0; i < genero.length; i++) {
			if (genero[i] == 'f') {
				mulheres++;
				alturaTotalMulheres = altura[i] + alturaTotalMulheres;
			} else {
				homens++;
			}
		}
		double mediaAlturaMulheres = alturaTotalMulheres / mulheres;

		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAlturaMulheres);
		System.out.println("Numero de homens = " + homens);

		sc.close();
	}

}
