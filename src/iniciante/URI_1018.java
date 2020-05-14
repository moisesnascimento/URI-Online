package iniciante;

import java.util.Scanner;

public class URI_1018 {
	
	public static void main(String[] args) {
      
		Scanner scan = new Scanner(System.in);
		int valor = scan.nextInt();
		
		System.out.println(valor);
	    int notasDeCem = valor / 100;
	    valor = valor % 100;
	    int notasDeCinquenta =  valor / 50 ;
	    valor = valor % 50;
	    int notasDeVinte = valor / 20;
	    valor = valor % 20;
	    int notasDeDez = valor / 10;
	    valor = valor % 10;
	    int notasDeCinco = valor / 5;
	    valor = valor % 5;
	    int notasDeDois = valor / 2;
	    valor = valor % 2;
	    int notasDeUm = valor / 1;
	    
	    System.out.println(notasDeCem + " nota(s) de R$ 100,00");
	    System.out.println(notasDeCinquenta + " nota(s) de R$ 50,00");
		System.out.println(notasDeVinte + " nota(s) de R$ 20,00");
		System.out.println(notasDeDez + " nota(s) de R$ 10,00");
		System.out.println(notasDeCinco + " nota(s) de R$ 5,00");
		System.out.println(notasDeDois + " nota(s) de R$ 2,00");
		System.out.println(notasDeUm + " nota(s) de R$ 1,00");
		scan.close();
	}
}
