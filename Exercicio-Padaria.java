package Aula;

import java.util.Scanner;

public class Padaria {
	private static Scanner entrada;

	public static void main(String[] args) {

		entrada = new Scanner(System.in);

		System.out.println("Quantidade de Paes vendidas: ");
		int qtdePaes = entrada.nextInt();

		System.out.println("Quantidade de Broas vendidas: ");
		int qtdeBroas = entrada.nextInt();

		double totalArrecadado = (qtdeBroas * 1.50) + (qtdePaes * 0.12);
		double poupanca = (totalArrecadado * 10) / 100;

		System.out.println("total arrecadado: " + totalArrecadado);
		System.out.println("Total que arrecadou na poupança: " + poupanca);
	}
}
