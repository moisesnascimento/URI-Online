package iniciante;

import java.util.Scanner;

public class URI_1017 {

	public static void main(String[] args) {
        
		Scanner scan = new Scanner(System.in);
		int horas = scan.nextInt();
		int velocidadeMedia = scan.nextInt();
		
		double distancia = horas * velocidadeMedia;
		double Litros = distancia / 12;
		
		
		System.out.printf("%.3f%s",Litros, "\n");
		
		
		scan.close();
	}
}
