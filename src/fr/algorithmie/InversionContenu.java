package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		// Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy mais
		// dans l’ordre inverse.
		
		int[] arrayCopy = new int[array.length] ;	
		int indexArrayCopy = array.length-1 ;
		for (int i = 0; i < array.length; i++) {
			arrayCopy[indexArrayCopy] = array[i];
			indexArrayCopy--;
		}
		
		// Afficher l’ensemble des éléments des 2 tableaux
		System.out.println("Afficher l’ensemble des éléments des 2 tableaux :");
		for (int i = 0; i < array.length; i++) {
			System.out.println("Index "+i+" array : "+array[i]+" ; arrayCopy :"+arrayCopy[i]);
		}
		
	}

}
