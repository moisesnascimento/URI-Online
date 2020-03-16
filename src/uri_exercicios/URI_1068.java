package uri_exercicios;

import java.util.Stack;

public class URI_1068 {

	public static void verificaExpressao(String expressao) {
		Stack<Character> pilha = new Stack<Character>();
		char[] c = new char[expressao.length()];

		for (int i = 0; i < expressao.length(); i++) {
			c[i] = expressao.charAt(i);
		}
		for (int i = 0; i < c.length; i++) {
			if (c[i] == '(') {
				pilha.push('(');
			} else if (c[i] == (')')) {
				if (pilha.isEmpty()) {
					pilha.push(')');
				} else {
					pilha.pop();
				}
			}
		}
		if (pilha.empty()) {
			System.out.println("correct");
		} else {
			System.out.println("incorrect");
		}
	}

	public static void main(String[] args) {

		java.util.Scanner scan = new java.util.Scanner(System.in);

		while (scan.hasNext()) {
			String expressao = scan.next();
			URI_1068.verificaExpressao(expressao);
		}

		scan.close();
	}
}
