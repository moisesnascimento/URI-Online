package iniciante;

import java.util.Scanner;

public class URI_1038 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int codigo = scan.nextInt();
		int quantidade = scan.nextInt();

		switch (codigo) {
		case 1: {
			
			double valor1 = quantidade * 4.00;
			System.out.printf("Total: R$ %.2f%s", valor1, "\n");
			break;
		}
		case 2: {
			
			double valor2 = quantidade * 4.50;
			System.out.printf("Total: R$ %.2f%s", valor2, "\n");
			break;
		}
		case 3: {
			
			double valor3 = quantidade * 5.00;
			System.out.printf("Total: R$ %.2f%s", valor3, "\n");
			break;
		}
		case 4: {
			
			double valor4 = quantidade * 2.00;
			System.out.printf("Total: R$ %.2f%s", valor4, "\n");
			break;
		}
		case 5: { 
			
			double valor5 = quantidade * 1.50;
			System.out.printf("Total: R$ %.2f%s", valor5, "\n");
		 	break;
		    }
		}
		scan.close();
	}
}
