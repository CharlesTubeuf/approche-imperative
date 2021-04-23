package fr.algorithmie;

import java.util.Arrays;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18 } ;
        
//        Créer un tableau qui contient la somme des 2 précédents tableaux
        int[] arrayFinal = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            if (i >= array2.length) {
                arrayFinal[i] = array1[i];        
            } else {
                arrayFinal[i] = array1[i] + array2[i];
            }
        }
//        Affichage
        System.out.println(Arrays.toString(arrayFinal));
	}

}
