package iniciante;

public class URI_3039 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int N = scan.nextInt();

		int totalCarrinhos = 0, totalBonecas = 0;
		while (N > 0) {
			scan.next();
			String genero = scan.next();
			if (genero.equals("M")) {
				totalCarrinhos++;
			} else {
				totalBonecas++;
			}
			N--;
		}
		System.out.println(totalCarrinhos + " carrinhos");
		System.out.println(totalBonecas + " bonecas");
		scan.close();
	}
}
