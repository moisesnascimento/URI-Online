package iniciante;

import java.text.DecimalFormat;

public class URI_2029 {

	public static double PI = 3.14;

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("0.00");
		java.util.Scanner scan = new java.util.Scanner(System.in);

		while (scan.hasNext()) {
			double volume = scan.nextDouble();
			double diametro = scan.nextDouble();			
			double raio = diametro / 2;
			double altura = volume / (PI * Math.pow(raio, 2));
			double areaBase = (PI * Math.pow(raio, 2));
			System.out.println("ALTURA = " + df.format(altura));
			System.out.println("AREA = " + df.format(areaBase));
		}
		scan.close();
	}
}
