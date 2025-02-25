package test1;

import java.util.Scanner;

public class guardachuva {

	public static void main(String[] args) {

		// Tabela Operador AND
		System.out.println("Tabela-verdade do Operador AND: ");
		System.out.println("Chovendo     |  Previsão Chuva  |  Pode Atravessar? ");
		System.out.println("true         |  true            | " + (true || true));
		System.out.println("true         |  false           | " + (true || false));
		System.out.println("false 	     |  true            | " + (false || true));
		System.out.println("false        |  false           | " + (false || false));

		// Entrada do Usuário
		Scanner sc = new Scanner(System.in);

		System.out.print("Está chovendo agora? (true/false): ");
		boolean chov = sc.nextBoolean();

		System.out.print("A previsão indica chuva? (true/false): ");
		boolean prev = sc.nextBoolean();

		// Processamento
		boolean levar = chov || prev;

		// Saída
		System.out.print("Deve levar o guarda-chuva? " + levar);

		sc.close();
	}

}
