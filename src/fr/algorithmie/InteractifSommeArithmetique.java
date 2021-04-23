package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Ecrire un programme qui demande un nombre à l’utilisateur puis calcule la somme de tous les
//		entiers compris entre 1 et ce nombre.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez rentrer un nombre :");
		int nb = scanner.nextInt();
		
		int somme = nb; 

		int i = 0;
		while ( i < nb ) {
			somme += i ;
			i++;
		}
		
		System.out.println("la somme de touts les nombres de 1 à " + nb + " est : "+ somme);

		
	}

}
