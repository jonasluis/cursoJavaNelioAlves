import java.util.Scanner;

public class SomaVetores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();

		int[] A = new int[n];
		int[] B = new int[n];

		System.out.println("Digite os valores do vetor A:");
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}

		System.out.println("Digite os valores do vetor B:");
		for (int i = 0; i < n; i++) {
			B[i] = sc.nextInt();
		}

		int somaVetores = 0;
		System.out.println("VETOR RESULTANTE:");
		for (int i = 0; i < n; i++) {
			somaVetores = A[i] + B[i];
			System.out.println(somaVetores);
		}

		sc.close();

	}

}
