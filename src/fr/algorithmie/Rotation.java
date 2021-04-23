package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] tab = { 0, 1, 2, 3 };

//		Effectuez une rotation à droite des éléments.

		int[] tabRotation = new int[tab.length];

		tabRotation[0] = tab[tab.length - 1];
		for (int i = 1; i < tab.length; i++) {
			tabRotation[i] = tab[i - 1];
		}

//		affichage
		for (int i = 0; i < tabRotation.length; i++) {
			System.out.println(tabRotation[i]);
		}
	}

}
