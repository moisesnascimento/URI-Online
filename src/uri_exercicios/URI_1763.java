package uri_exercicios;

import java.util.HashMap;
import java.util.Map;

public class URI_1763 {

	public static void paises(String pais) {
		HashMap<String, String> paises = new HashMap<>();
		paises.put("brasil", "Feliz Natal!");
		paises.put("alemanha", "Frohliche Weihnachten!");
		paises.put("austria", "Frohe Weihnacht!");
		paises.put("coreia", "Chuk Sung Tan!");
		paises.put("espanha", "Feliz Navidad!");
		paises.put("grecia", "Kala Christougena!");
		paises.put("estados-unidos", "Merry Christmas!");
		paises.put("inglaterra", "Merry Christmas!");
		paises.put("australia", "Merry Christmas!");
		paises.put("portugal", "Feliz Natal!");
		paises.put("suecia", "God Jul!");
		paises.put("turquia", "Mutlu Noeller");
		paises.put("argentina", "Feliz Navidad!");
		paises.put("chile", "Feliz Navidad!");
		paises.put("mexico", "Feliz Navidad!");
		paises.put("antardida", "Merry Christmas!");
		paises.put("canada", "Merry Christmas!");
		paises.put("irlanda", "Nollaig Shona Dhuit!");
		paises.put("belgica", "Zalig Kerstfeest!");
		paises.put("italia", "Buon Natale!");
		paises.put("libia", "Buon Natale!");
		paises.put("siria", "Milad Mubarak!");
		paises.put("marrocos", "Milad Mubarak!");
		paises.put("japao", "Merii Kurisumasu!");

		for (Map.Entry<String, String> key : paises.entrySet()) {
			if (pais.equals(key.getKey())) {
				System.out.println(key.getValue());
			}
		}
		if (!paises.containsKey(pais)) {
			System.out.println("--- NOT FOUND ---");
		}
	}

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		while (scan.hasNext()) {
			String pais = scan.next();
			URI_1763.paises(pais);
		}
		scan.close();
	}
}
