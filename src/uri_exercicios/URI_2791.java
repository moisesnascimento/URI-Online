package uri_exercicios;

public class URI_2791 {

	public static void main(String[] args) {
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
		
		int[] encontraFeijao = new int[5];
		for (int i = 1; i <= encontraFeijao.length - 1; i++) {
			encontraFeijao[i] = scan.nextInt();
		}
		for (int i = 1; i <= encontraFeijao.length - 1; i++) {
			if(encontraFeijao[i] == 1) {
				System.out.println(i);
			}
		}
		scan.close();
	}
}
