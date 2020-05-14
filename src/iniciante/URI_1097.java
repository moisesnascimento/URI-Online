package iniciante;

public class URI_1097 {

	public static void main(String[] args) {

		int contador = 7;
		for (int i = 1; i <= 9; i += 2) {
			for (int j = 0; j < 3; j++) {
				
				System.out.print("I=" + i + " " + "J=" + (contador - j));
				System.out.println();
			}
			contador+=2;
		}
	}
}
