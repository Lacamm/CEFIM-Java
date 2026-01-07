import java.util.Scanner;

public class Tp2 {

    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        // fibo();
        // fiboTab();
        // fibo3();
        // triComptage();
        // triBulle();
        quickSort();

        scanner.close();
    }

    public static void fibo() {
        /*
         * régles fibo
         * F(0) = 0
         * F(1) = 1
         * F(n) = F(n)-1 + F(n)-2
         */
        int nombre;
        int nb1 = 0;
        int nb2 = 1;
        int res = 0;
        System.out.print("Saisir un nombre : ");
        nombre = scanner.nextInt();

        for (int i = 0; i <= nombre; i++) {
            if (i > 0) {
                if (i == 1) {
                    res = 1;
                } else {
                    res = nb1 + nb2;
                    nb1 = nb2;
                    nb2 = res;
                }
            }
            System.out.println(res);
        }
        System.out.println("Fibo à F" + nombre + " = " + res);
    }

    public static void fiboTab() {
        int nombre;
        int nb1 = 0;
        int nb2 = 1;
        System.out.print("Saisir un nombre : ");
        nombre = scanner.nextInt();
        int[] res = new int[nombre + 1];

        for (int i = 0; i <= nombre; i++) {
            if (i > 0) {
                if (i == 1) {
                    res[i] = 1;
                } else {
                    res[i] = nb1 + nb2;
                    nb1 = nb2;
                    nb2 = res[i];
                }
            } else {
                res[i] = 0;
            }
        }
        System.out.println(res[nombre]);
        System.out.println("Fibo à F" + nombre + " = " + res[nombre]);
    }

    public static void fibo3() {
        int nombre;
        System.out.print("Saisir un nombre : ");
        nombre = scanner.nextInt();
        for (int i = 2; i <= nombre; i++) {
            System.out.print(fiboRecu(i) + " ");
        }
    }

    public static int fiboRecu(int val) {
        if (val < 2) {
            return val;
        }
        return fiboRecu(val - 1) + fiboRecu(val - 2);
    }

    public static void triComptage() {
        int taille = 10;
        int[] tab = new int[taille];
        int[] tabCompt = new int[taille + 1];

        for (int i = 0; i < taille; i++) {
            tab[i] = (int) (Math.random() * 11);
        }

        for (int i = 0; i < taille; i++) {
            tabCompt[tab[i]]++;
        }

        int index = 0;
        for (int i = 0; i < tabCompt.length; i++) {
            while (tabCompt[i] > 0) {
                tab[index] = i;
                index++;
                tabCompt[i]--;
            }
        }

        for (int i = 0; i < taille; i++) {
            System.out.print(tab[i] + " ");
        }
    }

    public static void triBulle() {
        int[] tab1 = { 4, 6, 2, 9, 67, 4, 32, 9, 87, 50 };
        int[] tab2 = { 8, 5, 3, 5, 1, 9 };

        // int[] tabTri = tab1;
        int[] tabTri = tab2;

        for (int i = 0; i < tabTri.length; i++) {
            for (int y = 1; y < tabTri.length - i; y++) {
                if (tabTri[y] < tabTri[y - 1]) {
                    int tmp1 = tabTri[y];
                    int tmp2 = tabTri[y - 1];
                    tabTri[y] = tmp2;
                    tabTri[y - 1] = tmp1;
                }
            }
        }

        for (int i = 0; i < tabTri.length; i++) {
            System.out.print(tabTri[i] + " ");
        }
    }

    public static void quickSort() {
        int[] tab = { 6, 3, 7, 9, 1, 5, 4 };

        int indicePivot = tab.length - 1;
        int indiceComparaison = 0;

        while (indiceComparaison < indicePivot) {
            if (tab[indicePivot] < tab[indiceComparaison]) {
                int tmp = tab[indiceComparaison];
                tab[indiceComparaison] = tab[indicePivot - 1];
                tab[indicePivot - 1] = tab[indicePivot];
                tab[indicePivot] = tmp;
                indicePivot--;
                System.out.println("Permutation");
            } else {
                indiceComparaison++;
                System.out.println("Pas de permutation");
            }
            for (int i=0; i<tab.length; i++) {
                System.out.print(tab[i] + " ");
            }
            System.out.println();
        }
    }
}
