package uri_exercicios;

public class URI_2061 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		int numAbas = scan.nextInt(), acoesPericles = scan.nextInt();

		int qtdAbas = numAbas;
		while (acoesPericles > 0) {
			String acao = scan.next();
			if(acao.equals("fechou")) {
				qtdAbas = (qtdAbas - 1) + 2;
			}else if(acao.equals("clicou")) {
				qtdAbas-=1;
			}
			acoesPericles--;
		}
		System.out.println(qtdAbas);
		scan.close();
	}
}
