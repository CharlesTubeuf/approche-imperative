package fr.declaration.variable;

public class DeclarationApp {

	public static void main(String[] args) {

		byte varByte = 1;
		short varShort = 2;
		int varInt = 3;
		long varLong = 4L;
		float varFloat = 5.1f;
		double varDouble = 6.2d;
		char varChar = 'a';
		boolean varBoolean = true;
		String varString = "Bonjour Richard";

		System.out.println(varString); // affichage d'une variable
		System.out.println("littéral"); // affichage d'un littéral

		String randomString = "Voici le résultat d'un calcul : \n 1+5=6";
		System.out.println(randomString);
		int a = +2;
		double v = 057;
		System.out.println(v);
	}

}
