package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4 };

		boolean firstLast;
//		Algo de valorisation : 
		if (array.length >= 1 && array[0] == array[array.length - 1]) {
			firstLast = true;
		} else {
			firstLast = false;
		}

	}

}
