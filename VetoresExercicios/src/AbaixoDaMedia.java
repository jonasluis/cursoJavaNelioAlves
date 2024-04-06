import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		
		double somaVetor = 0;
		for (int i = 0; i < vetor.length; i++) {
			somaVetor += vetor[i];
		}
		
		
		double mediaVetor = somaVetor /n;	
		System.out.printf("MEDIA DO VETOR = %.3f%n", mediaVetor);
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < mediaVetor) {
				System.out.println(vetor[i]);
			}
		}
		
		
		
		
		
		
		sc.close();
	}

}
