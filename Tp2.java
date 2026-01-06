import java.util.Scanner;

public class Tp2 {

    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        // fibo();
        // fiboTab();
        fibo3();

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

    public static void fibo3(){
        int nombre;
        System.out.print("Saisir un nombre : ");
        nombre = scanner.nextInt();
        for (int i=2; i<=nombre; i++){
            System.out.print(fiboRecu(i) + " ");
        }
    }

    public static int fiboRecu(int val) {
        if (val < 2){
            return val;
        }
        return fiboRecu(val - 1) + fiboRecu(val - 2);
        }
}
