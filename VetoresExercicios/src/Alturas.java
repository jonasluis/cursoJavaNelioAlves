import java.util.Locale;
import java.util.Scanner;

public class Alturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		String nome[] = new String[n];
		int idade[] = new int[n];
		double[] alturas = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();
		}
				
		double somaAltura = 0;		
		for(int i = 0; i < n; i++) {
			somaAltura = somaAltura + alturas[i];
		}
		double alturaMedia = somaAltura / n;
							
		double pessoasMenores = 0;
		for(int i = 0; i < n; i++) {
			if(idade[i] < 16) {
				pessoasMenores++;
			}
		}
		
		double PorcentMenores = ((double)pessoasMenores / n ) * 100.0;
		
		 System.out.println();		
		System.out.printf("Altura média: %.2f%n", alturaMedia);
		System.out.printf("Pessoas com menos de 16 anos:  %.1f%%%n",PorcentMenores);
		
		for(int i = 0; i < n; i++) {
			if(idade[i] < 16) {
				System.out.printf("%s\n", nome[i]);
			}
		}
				
		sc.close();

	}

}
