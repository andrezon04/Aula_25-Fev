package test1;

public class oplogcou {

	public static void main(String[] args) {

		// Entrada
		int salario = 900;
		int idade = 19; // Declarar as variáveis
		boolean resultado;

		// Processamento
		boolean emp_aprovado = (salario > 1000 || idade > 18);
		resultado = (salario > 1000 || idade > 18) ? true : false;

		// Saida
		System.out.println(emp_aprovado);
		System.out.println(resultado);
	}

}
