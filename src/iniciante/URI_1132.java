package iniciante;

public class URI_1132 {

	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int X = scan.nextInt();
		int Y = scan.nextInt();

		int soma = 0;
		if (X < Y) {
			for (int i = X; i <= Y; i++) {
				if (i % 13 != 0) {
					soma += i;
				}
			}
		} else {
			for (int i = Y; i <= X; i++) {
				if (i % 13 != 0) {
					soma += i;
				}
			}
		}
		System.out.println(soma);
		scan.close();
	}
}
