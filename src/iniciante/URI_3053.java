package iniciante;

import java.util.HashMap;
import java.util.Map;

public class URI_3053 {

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);
		HashMap<Character, Character> map = new HashMap<>();
		int N = scan.nextInt();
		char posicaoMoeda = scan.next().charAt(0);
		char[] posicaoCopos = { 'A', 'B', 'C' };
		char aux;
		while (N > 0) {
			int moverCopoNaPosicaoX = scan.nextInt();
			for (int i = 0; i < posicaoCopos.length; i++) {
				if (moverCopoNaPosicaoX == 1 || moverCopoNaPosicaoX == 2) {
					aux = posicaoCopos[moverCopoNaPosicaoX - 1];
					posicaoCopos[moverCopoNaPosicaoX - 1] = posicaoCopos[moverCopoNaPosicaoX];
					posicaoCopos[moverCopoNaPosicaoX] = aux;
				}
				if (moverCopoNaPosicaoX == 3) {
					aux = posicaoCopos[0];
					posicaoCopos[0] = posicaoCopos[moverCopoNaPosicaoX - 1];
					posicaoCopos[posicaoCopos.length - 1] = aux;
				}
			}
			N--;
		}
		map.put('A', posicaoCopos[0]);
		map.put('B', posicaoCopos[1]);
		map.put('C', posicaoCopos[2]);
		for (Map.Entry<Character, Character> copo : map.entrySet()) {
			if(copo.getValue().equals(posicaoMoeda)) {
				System.out.println(copo.getKey());
			}
		}
		scan.close();
	}
}
