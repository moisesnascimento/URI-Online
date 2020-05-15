package estruturas;

import java.util.ArrayList;
import java.util.Collections;

public class URI_2022 implements Comparable<URI_2022> {

	private String objeto;
	private double valor;
	private int preferencia;

	public URI_2022(String objeto, double valor, int preferencia) {
		this.objeto = objeto;
		this.valor = valor;
		this.preferencia = preferencia;
	}

	public String getPresente() {
		return objeto;
	}

	public double getValor() {
		return valor;
	}

	public int getPreferencia() {
		return preferencia;
	}

	@Override
	public int compareTo(URI_2022 listaDesejos) {

		if (this.preferencia > listaDesejos.getPreferencia()) {
			return -1;
		}
		if (this.preferencia < listaDesejos.getPreferencia()) {
			return 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		while (scan.hasNext()) {
			ArrayList<URI_2022> listaDesejos = new ArrayList<>();
			String nome = scan.next();
			int qtdPresentes = scan.nextInt();
			scan.nextLine();
			for (int i = 0; i < qtdPresentes; i++) {
				String objeto = scan.nextLine();
				double preco = scan.nextDouble();
				int preferencia = scan.nextInt();
				scan.nextLine();
				listaDesejos.add(new URI_2022(objeto, preco, preferencia));
			}
			Collections.sort(listaDesejos);
			System.out.println("Lista de " + nome);
			for (URI_2022 lista : listaDesejos) {
				System.out.printf("%s - R$%.2f %d%n", lista.getPresente(), lista.getValor(),lista.getPreferencia());
			}
		}
		scan.close();
	}
}
