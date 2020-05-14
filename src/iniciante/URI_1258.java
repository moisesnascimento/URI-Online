package iniciante;

import java.util.ArrayList;
import java.util.Collections;

public class URI_1258 implements Comparable<URI_1258> {

	private String nome;
	private String corCamiseta;
	private String tamanhoCamiseta;

	public URI_1258(String nome, String corCamiseta, String tamanhoCamiseta) {
		this.nome = nome;
		this.corCamiseta = corCamiseta;
		this.tamanhoCamiseta = tamanhoCamiseta;
	}

	public String getNome() {
		return nome;
	}

	public String getCorCamiseta() {
		return corCamiseta;
	}

	public String getTamanhoCamiseta() {
		return tamanhoCamiseta;
	}

	@Override
	public int compareTo(URI_1258 pessoa) {
		return this.getTamanhoCamiseta().compareToIgnoreCase(pessoa.getTamanhoCamiseta());
	}

	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		while (scan.hasNext()) {
			ArrayList<URI_1258> pessoa = new ArrayList<>();
			int N = scan.nextInt();
			scan.nextLine();
			for (int i = 0; i < N; i++) {
				String nome = scan.nextLine();
				String corCamiseta = scan.next();
				String tamanho = scan.next();
				scan.nextLine();
				pessoa.add(new URI_1258(nome, corCamiseta, tamanho));
			}
			Collections.sort(pessoa);
			for (URI_1258 pessoas : pessoa) {
				System.out.println(
						pessoas.getCorCamiseta() + " " + pessoas.getTamanhoCamiseta() + " " + pessoas.getNome());
			}
		}
		scan.close();
	}
}
