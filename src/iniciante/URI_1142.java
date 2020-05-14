package iniciante;

public class URI_1142 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int X = scan.nextInt();

		int contador = 1;
		for (int i = 0; i < X; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(contador + " ");
				contador++;
			}
			System.out.println("PUM");
			contador++;
		}
		scan.close();
	}
}
