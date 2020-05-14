package iniciante;

public class URI_1050 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int DDD = scan.nextInt();

		String[] destinacao = new String[72];
		destinacao[61] = "Brasilia";
		destinacao[71] = "Salvador";
		destinacao[11] = "Sao Paulo";
		destinacao[21] = "Rio de Janeiro";
		destinacao[32] = "Juiz de Fora";
		destinacao[19] = "Campinas";
		destinacao[27] = "Vitoria";
		destinacao[31] = "Belo Horizonte";

		if (destinacao[DDD] == null) {

			System.out.println("DDD nao cadastrado");

		} else {

			System.out.println(destinacao[DDD]);
		}
		scan.close();
	}

}
