import java.util.Random;
import java.util.Scanner;

public class Tp1 {

	// Le scanner permet de saisir au clavier des données lors de l'exécution du programme.
	private static Scanner scanner;

	// Méthode principale
	public static void main(String[] args) {

		scanner = new Scanner(System.in);

		// Appel de la méthode de l'exercice 1.1
		// exercice1_1();
		// exercice1_2();
		exercice2_1();

		scanner.close();
	}

	// Méthode de l'exercice n°1.1
	public static void exercice1_1() {

		// 1° - Déclaration
		String prenom;
		String nom;
		int age;
		
		// 2° - Initialisation
		System.out.print("Prénom : ");
		prenom = scanner.next();
		System.out.print("Nom : ");
		nom = scanner.next();
		System.out.print("Age : ");
		age = scanner.nextInt();

		// 3° - Utilisation
		System.out.println("Bonjour " + prenom + " " + nom + " " + "(" + age + " ans) .");
	}

	// Méthode de l'exercice n°1.2 
	public static void exercice1_2() {
		int x;
		int y;
		int tmp;

		System.out.print("x : ");
		x = scanner.nextInt();
		System.out.print("y : ");
		y = scanner.nextInt();

		tmp = x;
		x = y;
		y = tmp;

		System.out.println("Les valeurs sont permutées, x vaut "+ x + " et y vaut " + y);
	}

	public static void exercice2_1() {
		String mot1;
		String mot2;

		System.out.print("Saisir un premier mot : ");
		mot1 = scanner.next();
		System.out.print("Saisir un second mot : ");
		mot2 = scanner.next();

		if (mot1.length()>mot2.length()) {
			System.out.println(mot1 + " est le mot avec le plus de caractères.");
		} else {
			System.out.println(mot2 + " est le mot avec le plus de caractères.");
		}
	}

	
}
