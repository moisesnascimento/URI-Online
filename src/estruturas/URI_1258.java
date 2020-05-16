package estruturas;

import java.util.ArrayList;
import java.util.Collections;

public class URI_1258 implements Comparable<URI_1258> {

	private String nomeEstudante;
	private String corCamiseta;
	private String tamanhoCamiseta;

	public URI_1258(String nomeEstudante, String tamanhoCamiseta, String corCamiseta) {
		this.nomeEstudante = nomeEstudante;
		this.corCamiseta = corCamiseta;
		this.tamanhoCamiseta = tamanhoCamiseta;
	}

	public String getNomeEstudante() {
		return nomeEstudante;
	}

	public String getCorCamiseta() {
		return corCamiseta;
	}

	public String getTamanhoCamiseta() {
		return tamanhoCamiseta;
	}

	@Override
	public int compareTo(URI_1258 listaCamisetas) {
		return this.getCorCamiseta().compareToIgnoreCase(listaCamisetas.getCorCamiseta());
	}

	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		while (scan.hasNext()) {
			ArrayList<URI_1258> listaCamisetas = new ArrayList<>();
			int qtdCamisetas = scan.nextInt();
			scan.nextLine();
			for (int i = 0; i < qtdCamisetas; i++) {
				String nomeEstudante = scan.nextLine();
				String corCamiseta = scan.next();
				String tamanhoCamiseta = scan.next();
				scan.nextLine();
				listaCamisetas.add(new URI_1258(nomeEstudante, tamanhoCamiseta, corCamiseta));
			}
			Collections.sort(listaCamisetas);
			for (URI_1258 lista : listaCamisetas) {
				System.out.printf("%s %s %s%n", lista.getCorCamiseta(), lista.getTamanhoCamiseta(),
						lista.getNomeEstudante());
			}
		}
		scan.close();
	}
}
