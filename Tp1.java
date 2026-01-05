// import java.util.Random;
import java.util.Scanner;

public class Tp1 {

	// Le scanner permet de saisir au clavier des données lors de l'exécution du
	// programme.
	private static Scanner scanner;

	// Méthode principale
	public static void main(String[] args) {

		scanner = new Scanner(System.in);

		// Appel de la méthode de l'exercice 1.1
		// exercice1_1();
		// exercice1_2();
		// exercice2_1();
		// exercice2_2();
		// exercice3_1();
		exercice4_1();

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
		System.out.println("Les valeurs sont permutées, x vaut " + x + " et y vaut " + y);
	}

	public static void exercice2_1() {
		String mot1;
		String mot2;

		System.out.print("Saisir un premier mot : ");
		mot1 = scanner.next();
		System.out.print("Saisir un second mot : ");
		mot2 = scanner.next();

		if (mot1.length() > mot2.length()) {
			System.out.println(mot1 + " est le mot avec le plus de caractères.");
		} else if (mot1.length() < mot2.length()){
			System.out.println(mot2 + " est le mot avec le plus de caractères.");
		} else if (mot1.length() == mot2.length()) {
			System.out.println("Les 2 mots font la même longueur");
		} else {
			/* Cas impossible, j'aurai pu mettre juste else au dessus, mais je voulais mettre 
			clairement le test de l'égalité */ 
		}
	}

	public static void exercice2_2() {
		int annee;

		System.out.print("Saisir une année : ");
		annee = scanner.nextInt();

		/* Une année bissextile est
		 - soit divisible par 4 mais pas par 100
		 - soit divisible par 400 */
		if ((annee % 4 == 0 && annee % 100 != 0) || annee % 400 == 0) {
			System.out.println("L'année " + annee + " est bissextile");
		} else {
			System.out.println("L'année " + annee + " n'est pas bissextile");
		}
	}

	public static void exercice3_1() {
		int rand;
		int maxi;
		int mini;
		int indiceMaxi = 1;
		int indiceMini = 1;

		mini = maxi = rand = (int) (Math.random() * 101);

		for (int i = 1; i <= 10; i++) {
			System.out.println("Le nombre " + i + " vaut " + rand);
			if (rand > maxi) {
				maxi = rand;
				indiceMaxi = i;
			}
			if (rand < mini) {
				mini = rand;
				indiceMini = i;
			}
			rand = (int) (Math.random() * 101);
		}
		System.out.println("Le maximum vaut " + maxi + " (numéro " + indiceMaxi + ")"
				+ ", le minimum vaut " + mini + " (numéro " + indiceMini + ")");
	}

	public static void exercice4_1() {
		int rand = (int) (Math.random() * 101);
		System.out.println(rand);
		System.out.print("Enter un nombre : ");
		int guess = scanner.nextInt();
		int cpt = 0;

		while (guess != rand) {
			if (Math.abs(guess-rand) >= 20) {
				System.out.println("-----> froid");
				cpt++;
			} else if (Math.abs(guess-rand) < 20 && Math.abs(guess-rand) >= 6) {
				System.out.println("-----> tiède");
				cpt++;
			} else if (Math.abs(guess-rand) < 6 && Math.abs(guess-rand) >= 1) {
				System.out.println("-----> chaud");
				cpt++;
			}
			System.out.print("Enter un nombre : ");
			guess = scanner.nextInt();
		}
		System.out.println("-----> gagné (" + cpt +" tentatives)");
	}
}
