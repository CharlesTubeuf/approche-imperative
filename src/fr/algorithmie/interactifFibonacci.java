package fr.algorithmie;

import java.util.Scanner;

public class interactifFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Choisissez un rang sur le tableau de Fibonacci de 1 à X : ");
		int rang = scanner.nextInt();
		
		int[] tabFibonacci = new int[rang];
		tabFibonacci[0] =0;
		if ( rang > 1 ) {
			tabFibonacci[1] =1;
		}
		
		 for (int i = 2 ; i < rang ; i++) {
			tabFibonacci[i] = tabFibonacci[i-1] + tabFibonacci[i-2];
		}
		 System.out.println("Le nombre de fibonacci au rang " + rang + " est " + tabFibonacci[rang-1]);
		 
	}

}
