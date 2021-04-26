package fr.algorithmie;

import java.util.Scanner;

public class Interactif21Batons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(
				"Bienvenu sur le jeu des 21 batons. Êtes vous prêt à affronter l'ordinateur ? \n Vous allez devoir retirer à tour de rôle entre 1 et 3 batons. Celui qui retire le dernier baton à perdu ! \n C'est Partie ! \n\n");

		int nombreBaton = 21;

		while (nombreBaton >= 1) {
			affichage(nombreBaton);
			nombreBaton -= tourJoueur();
			if (nombreBaton <= 0) {
				System.out.println("VOUS AVEZ PERDU. \n Vous avez pris le(s) dernier(s) baton(s).");
				break;
			}
			affichage(nombreBaton);
			int stockageTourIa = tourIA(nombreBaton);
			nombreBaton -= stockageTourIa; 
			System.out.println("L'ordinateur a choisi d'enlever " + stockageTourIa + " baton(s) \n");
			if (nombreBaton <= 0) {
				System.out.println("BRAVO !! VOUS AVEZ GAGNER. \n L'ordinateur a pris le(s) dernier(s) baton(s).");
				break;
			}
		}

	}

	static void affichage(int batonRestant) {
		for (int i = 0; i < batonRestant; i++) {
			System.out.print("| ");
			if(i == batonRestant-1) {
				System.out.println("");
				System.out.println("");
			}
		}
	}

	static int tourJoueur() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("A vous de jouer, combien de baton enlevez-vous ? 1, 2 ou 3 : \n");

		int choix = scanner.nextInt();
		while (choix < 1 || choix > 3) {
			System.out.println("\n Attention, vous devez enlever 1, 2 ou 3 baton(s) ! Choisisez : \n");
			choix = scanner.nextInt();
		}
		return choix;
	}

	static int tourIA(int batonRestant) {
		switch (batonRestant) {
		case 1:
			return 1;
		case 2:
			return 1;
		case 3:
			return 2;
		case 4:
			return 3;
		case 5:
			return 1;
		case 6:
			return 1;
		case 7:
			return 2;
		case 8:
			return 3;
		default:
			return (1 + (int) (Math.random() * 3));
		}
	}
}
