package iniciante;

import java.util.Scanner;

public class URI_1064 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int total = 0;
		double media = 0;
		double somaValores= 0;
		
		for (int i = 1; i <= 6; i++) {
			double valores = scan.nextDouble();

			if(valores >= 1) {
				total++;
			    somaValores += valores;
			    media = somaValores / total;
			}

		}
		System.out.println(total + " Valores positivos");
		System.out.printf("%.1f%n",media);
	  scan.close();
	}
}
