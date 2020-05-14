package iniciante;

public class URI_1114 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int senha = scan.nextInt();

		while (senha != 2002) {
			System.out.println("Senha Invalida");
			senha = scan.nextInt();
		}
		if (senha == 2002) {
			System.out.println("Acesso Permitido");
		}
		scan.close();
	}

}
