package fr.algorithmie;

public class AffichageSuite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 10; i++) {
			if (i == 1) {
				System.out.println("boucle for pour afficher tous les nombres de 1 à 10 inclus");
			}
			System.out.println(i);
		}

		for (int i = 0; i <= 10; i++) {
			if (i == 0) {
				System.out.println("boucle for pour afficher tous les nombres de 1 à 10 inclus");
			}
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		for (int i = 0; i < 10; i++) {
			if (i == 0) {
				System.out.println("boucle for pour afficher tous les nombres impairs entre 0 et 9 inclus");
			}
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}

		int count = 1;
		while (count <= 10) {
			if (count == 1) {
				System.out.println("Utiliser une boucle while pour afficher tous les nombres de 1 à 10 inclus");
			}
			System.out.println(count);
			count++;
		}

		count = 0;
		while (count <= 10) {
			if (count == 0) {
				System.out
						.println("Utiliser une boucle while pour afficher tous les nombres pairs entre 0 et 10 inclus");
			}
			if (count % 2 == 0) {
				System.out.println(count);
			}
			count++;
		}

		count = 0;
		while (count < 10) {
			if (count == 0) {
				System.out.println(
						"Utiliser une boucle while pour afficher tous les nombres impairs entre 0 et 9 inclus");
			}
			if (count % 2 == 1) {
				System.out.println(count);
			}
			count++;
		}

	}

}
