package iniciante;

public class URI_2850 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);

		while (scan.hasNext()) {
			String pernaLevantada = scan.nextLine();
			if (pernaLevantada.equals("esquerda")) {
				System.out.println("ingles");
			} else if (pernaLevantada.equals("direita")) {
				System.out.println("frances");
			} else if (pernaLevantada.equals("as duas")) {
				System.out.println("caiu");
			} else {
				System.out.println("portugues");
			}
		}
		scan.close();
	}
}
