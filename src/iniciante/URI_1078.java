package iniciante;

public class URI_1078 {

	public static void calculoTabuada(int valor) {

		int multi = 1;
		for (int i = 1; i <= 10; i++) {

			multi = valor * i;
			System.out.println(i + " x " + valor + " = " + multi);

		}

	}

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		URI_1078.calculoTabuada(scan.nextInt());
		
		scan.close();
	}
}
