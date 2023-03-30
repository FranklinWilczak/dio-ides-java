package Pacote1;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		int opcao = -1;
		double num1 = 0;
		double num2 = 0;
		double resultado = 0;

		// Instancia das classes e objetos que vamos utilizar
		Scanner entrada = new Scanner(System.in);

		while (opcao != 0) {
			System.out.print("\n\n---------- Calculadora ----------" + "\n" + "\n  |    1 - Somar             | "
					+ "\n  |    2 - Subtrair          | " + "\n  |    3 - Dividir           | "
					+ "\n  |    4 - Multiplicar       | " + "\n  |--------------------------| "
					+ "\n  |    0  -  S A I R         | " + "\n" + "\nInforme a operação desejada >>> ");

			// CAPTURA A OPÇÃO DO MENU DIGITADA PELO USUARIO
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("\n\nInforme um número para sua soma >>> ");
				num1 = entrada.nextFloat();
				System.out.print("Infore outro número >>> ");
				num2 = entrada.nextFloat();

				// Instancia a classe SOMA, criando o objeto soma
				Soma soma = new Soma(num1, num2);

				// Atribui o resultado do método calculaSoma para a variavel Resultado
				resultado = soma.calculaSoma(num1, num2);

				// Exibe a saída ao usuario
				System.out.println("Resultado: " + num1 + " + " + num2 + " = " + resultado);

				break;

			case 2:
				System.out.print("\n\nInforme um número para sua subtração >>> ");
				num1 = entrada.nextFloat();
				System.out.print("Infore outro número >>> ");
				num2 = entrada.nextFloat();

				// Instancia a classe SUBTRAI, criando o objeto soma
				Subtrai sub = new Subtrai(num1, num2);

				// Atribui o resultado do método calculaSubtracao para a variavel Resultado
				resultado = sub.calculaSubtracao(num1, num2);

				// Exibe a saída ao usuario
				System.out.println("Resultado: " + num1 + " + " + num2 + " = " + resultado);

				break;

			case 3:
				System.out.print("\n\nInforme um número para sua divisão >>> ");
				num1 = entrada.nextFloat();
				System.out.print("Infore outro número >>> ");
				num2 = entrada.nextFloat();

				// Instancia a classe DIVIDE, criando o objeto soma
				Divide div = new Divide(num1, num2);

				// Atribui o resultado do método calculaDivisao para a variavel Resultado
				resultado = div.calculaDivisao(num1, num2);

				// Exibe a saída ao usuario
				System.out.println("Resultado: " + num1 + " + " + num2 + " = " + resultado);

				break;

			case 4:
				System.out.print("\n\nInforme um número para sua soma >>> ");
				num1 = entrada.nextFloat();
				System.out.print("Infore outro número >>> ");
				num2 = entrada.nextFloat();

				// Instancia a classe MULTIPLICA, criando o objeto soma
				Multiplica mult = new Multiplica(num1, num2);

				// Atribui o resultado do método calculaMultiplicacao para a variavel Resultado
				resultado = mult.calculaMultiplicacao(num1, num2);

				// Exibe a saída ao usuario
				System.out.println("Resultado: " + num1 + " + " + num2 + " = " + resultado);

				break;

			default:
				if (opcao != 0) {
					System.out.println("\n\nVocê precisa selecionar uma das opções válidas\n");
				}
				break;

			}
		}
		System.out.println("\n\nObrigado por utilizar nossa Calculadora de Console!\n");
		entrada.close();
	}
}
