package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez rentrer un nombre entre 1 et 10 :");
		int nb = scanner.nextInt();
		while (nb > 10 || nb < 1) {
			System.out.println("Vous vous êtes trompé, veuillez rentrer un nombre entre 1 et 10 :");
			nb = scanner.nextInt();
		}

		System.out.println("La table de multiplication de " + nb + " est :");

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " * " + nb + " = " + nb * i);
		}

	}

}
