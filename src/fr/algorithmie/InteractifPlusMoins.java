package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		
		
	
		int randomNumber = 1 + (int)(Math.random() * ((100 - 1) + 1));


		Scanner scanner = new Scanner(System.in);
		System.out.println("Essayer de trouver le nombre entre 1 et 100 :) ");
		int nb = scanner.nextInt();
		int count = 0;
		
		while(nb != randomNumber ) {
			if( nb > randomNumber) {
				System.out.println("Votre nombre est trop grand, réessayé :");
				nb = scanner.nextInt();
				count++;
			}
			if( nb < randomNumber) {
				System.out.println("Votre nombre est trop petit, réessayé :");
				nb = scanner.nextInt();
				count++;
			}
		}
		System.out.println("Bravo, vous avez trouvé en "+ count + " essais");
		
		
	}

}
