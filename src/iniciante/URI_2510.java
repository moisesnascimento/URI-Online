package iniciante;

public class URI_2510 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int N = scan.nextInt();

		while (N > 0) {
			String nomeVilao = scan.next();
			if (nomeVilao.equals("Batmain")) {
				System.out.println("N");
			} else {
				System.out.println("Y");
			}
			N--;
		}
		scan.close();
	}
}
