package iniciante;

import java.util.HashMap;
import java.util.Map;

public class URI_1049 {

	public static void main(String[] args) {
		Map<String, String> animal = new HashMap<>();
		animal.put("vertebradoavecarnivoro", "aguia");
		animal.put("vertebradoaveonivoro", "pomba");
		animal.put("vertebradomamiferoonivoro", "homem");
		animal.put("vertebradomamiferoherbivoro", "vaca");
		animal.put("invertebradoinsetohematofago", "pulga");
		animal.put("invertebradoinsetoherbivoro", "lagarta");
		animal.put("invertebradoanelideohematofago", "sanguessuga");
		animal.put("invertebradoanelideoonivoro", "minhoca");

		java.util.Scanner scan = new java.util.Scanner(System.in);
		String caracteristica1 = scan.next();
		String caracteristica2 = scan.next();
		String caracteristica3 = scan.next();

		String caracteristicas = caracteristica1 + caracteristica2 + caracteristica3;
		System.out.println(animal.get(caracteristicas));

		scan.close();
	}
}
