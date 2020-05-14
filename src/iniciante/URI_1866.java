package iniciante;

public class URI_1866 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int C = scan.nextInt();

		int contador = 0;
		while (contador < C) {
			int soma = 0, num = 1;
			int N = scan.nextInt();
			for (int i = 0; i < N; i++) {
				int var = num;
				num = num * -1;
				soma += var;
			}
			System.out.println(soma);
			contador++;
		}
		scan.close();
	}
}
