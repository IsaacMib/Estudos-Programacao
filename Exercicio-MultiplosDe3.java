package Aula;

import java.util.Scanner;

public class MultiplosDe3 {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		System.out.println("Informe um n�mero : ");
		int n1 = sc.nextInt();

		if (n1 % 3 == 0) {
			System.out.println("� multiplo de 3!");
		} else {
			System.out.println("N�o � multiplo de 3!");
		}

	}
}