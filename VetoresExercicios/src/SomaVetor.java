import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double vetor[] = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		
		for(int i = 0; i < n; i++) {
			soma += vetor[i];
		}
		
		double media = soma / n;
		
		System.out.println();
		System.out.print("VALORES = ");
		
		for(int i = 0; i < n; i++) {
			System.out.printf("%.1f ", vetor[i] );
		}
		
		System.out.printf("\nSOMA = %.2f%n ", soma);
		System.out.printf("MEDIA = %.2f%n ", media);
		
		sc.close();

	}

}
