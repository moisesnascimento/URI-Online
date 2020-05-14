package iniciante;

public class URI_3076 {

	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		while (scan.hasNext()) {
			int ano = scan.nextInt();
			if (ano % 100 == 0) {
				System.out.println(ano / 100);
			} else {
				System.out.println((ano / 100) + 1);
			}
		}
		scan.close();
	}
}
