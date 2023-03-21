package Aula;

import java.util.Scanner;

public class Gasolina {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		System.out.println("Tipo Gasolina : ");
		String combustivel = sc.nextLine();

		System.out.println("Capacidade do Tanque: ");
		double capacidadeTanque = sc.nextDouble();
		double valorPago;

		if (combustivel.equalsIgnoreCase("G")) {
			valorPago = capacidadeTanque * 3.79;
			System.out.println("O Valor pago na Gasolina : " + valorPago);

		} else if (combustivel.equalsIgnoreCase("A")) {
			valorPago = capacidadeTanque * 2.90;
			System.out.println("O Valor pago na Alcool : " + valorPago);

		} else {
			System.out.println("Invalido");
		}

	}
}
