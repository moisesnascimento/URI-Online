package uri_exercicios;

public class URI_2763 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		String cpf = scan.next();
		for (int i = 0; i < cpf.length(); i++) {
			if(cpf.charAt(i) == '.') {
				cpf = cpf.replaceFirst(".", "");
				System.out.println();
			}else if(cpf.charAt(i) == '-') {
				cpf = cpf.replaceFirst("-", "");
				System.out.println();
			}
			System.out.print(cpf.charAt(i));
		}
		System.out.println();
		scan.close();
	}
}
