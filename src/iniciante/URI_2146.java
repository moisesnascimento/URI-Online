package iniciante;

public class URI_2146 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);

		while (scan.hasNext()) {
			int senha = scan.nextInt();
			System.out.println(senha - 1);
		}
		scan.close();
	}
}
