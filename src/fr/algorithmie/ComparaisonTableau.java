package fr.algorithmie;

public class ComparaisonTableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = { 1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4 };
		int[] array2 = { 3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8 };

//		Ecrire le code permettant de compter le nombre d’éléments en commun dans ces 2
//		tableaux

		int count = 0;
		for (int i = 0; i < array1.length; i++) {
			for (int a = 0; a < array2.length; a++) {
				if (array1[i] == array2[a]) {
					count++;
					break;
				}
			}
		}
		System.out.println("Il y  a "+count+" éléments en commun");

	}

}
