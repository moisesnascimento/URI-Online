package string;

public class URI_2714 {

	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int N = scan.nextInt();

		while (N > 0) {
			String senha = scan.next();
			if (senha.matches("[A-Z]{2}[0-9]{18}")) {
				for (int i = 2; i < senha.length(); i++) {
					if (senha.charAt(i) != '0') {
						senha = senha.substring(i, senha.length());
						break;
					}
				}
				System.out.println(senha);
			} else {
				System.out.println("INVALID DATA");
			}
			N--;
		}
		scan.close();
	}
}
