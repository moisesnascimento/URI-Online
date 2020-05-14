package iniciante;

public class URI_1150 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int X = scan.nextInt();
		int Z = scan.nextInt();

		while (Z <= X) {
			Z = scan.nextInt();
		}
		int soma = 0, contador = 0;
		for (int i = X; i < Z; i++) {
			if (soma > Z) {
				break;
			} else {
				soma += i;
				contador++;
			}
		}
		System.out.println(contador);
		scan.close();
	}
}
