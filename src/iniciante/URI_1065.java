package iniciante;

import java.util.Scanner;

public class URI_1065 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int pares = 0;
		int impar = 0;
		int positivos = 0;
		int negativos = 0;

		for (int i = 1; i <= 5; i++) {

			int valores = scan.nextInt();

			if (valores % 2 == 0) {
				pares++;

			} else {

				impar++;
			}
			if (valores > 0) {

				positivos++;

			} else if (valores <= -1) {

				negativos++;
			}

		}
		System.out.println(pares + " valor(es) par(es)");
		System.out.println(impar + " valor(es) impar(es)");
		System.out.println(positivos + " valor(es) positivo(s)");
		System.out.println(negativos + " valor(es) negativo(s)");

		scan.close();
	}
}
