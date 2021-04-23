package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {

//		Ecrire un programme qui demande 10 nombres à un utilisateur et qui affiche le plus grand de
//		ces nombres.
		Scanner scanner = new Scanner(System.in);
		int max = 0;

		for (int i = 0; i <= 10; i++) {
			System.out.println("Veuillez rentrer 10 nombres d'affiler séparer par la touche ENTRER :");
			int nb = scanner.nextInt();
			if (nb > max) {
				max = nb;
			}
		}
		System.out.println("VOTRE PLUS GRAND NOMBRE ETAIT : " + max);
		
	}

}
