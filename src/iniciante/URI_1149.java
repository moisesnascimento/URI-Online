package iniciante;

public class URI_1149 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);

		int valorA = scan.nextInt();
		int valorN = scan.nextInt();

		int soma, total = 0;
		while (valorN == 0 || valorN < 0) {
			valorN = scan.nextInt();
		}
		for (int i = 0; i < valorN; i++) {
			soma = valorA + i;
			total += soma;
		}
		System.out.println(total);
		scan.close();
	}
}
