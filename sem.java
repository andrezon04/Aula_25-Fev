package test1;

import java.util.Scanner;

public class sem {

	public static void main(String[] args) {

		// Tabela Operador AND
		System.out.println("Tabela-verdade do Operador AND: ");
		System.out.println("Sinal Verde  |  Pedestres  |  Pode Atravessar? ");
		System.out.println("true         |  true       | " + (true && !true));
		System.out.println("true         |  false      | " + (true && !false));
		System.out.println("false 	     |  true       | " + (false && !true));
		System.out.println("false        |  false      | " + (false && !false));

		// Entrada do usuário
		Scanner sc = new Scanner(System.in);

		System.out.print("O sinal está verde? (true/false): ");
		boolean sinalverde = sc.nextBoolean();

		System.out.print("Existem pedestres no caminho? (true/false): ");
		boolean pedestres = sc.nextBoolean();

		// Processamento
		boolean perm = sinalverde && !pedestres;

		// Saída
		System.out.println("É permitido atravessar a rua?: " + perm);

		sc.close();

	}

}