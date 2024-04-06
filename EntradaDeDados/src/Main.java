import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Para ler um texto ATÉ A QUEBRA DE LINHA

		String s1, s2, s3;
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
		
		/* Para ler vários dados na mesma linha

	    String x;
		int y;
		double z;
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
		*/
		
		/*
		 * sc.next() = String 
		 * nextInt() = int 
		 * sc.nextDouble() = double
		 * sc.next().charAt(0)= char
		 * sc.nextLine()= Quebrar Linha
		 */

	}

}
