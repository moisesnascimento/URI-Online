package iniciante;

import java.util.Scanner;

public class URI_1020 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        int idadeEmDias = scan.nextInt();
        
        int idadeEmAnos = idadeEmDias / 365;
        idadeEmDias = idadeEmDias % 365;
        int idadeEmMes = idadeEmDias / 30;
        idadeEmDias = idadeEmDias % 30;
        int idadeDias = idadeEmDias;
        
        System.out.println(idadeEmAnos + " ano (s)");
        System.out.println(idadeEmMes + " mes (es)");
        System.out.println(idadeDias + " dia (s)");
        scan.close();
        
	}
}
