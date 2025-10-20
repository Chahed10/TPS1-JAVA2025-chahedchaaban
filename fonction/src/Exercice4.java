
import java.util.Scanner;

public class Exercice4 {
    public static int lectureN() {
        Scanner sc=new Scanner(System.in);
        int n;
        do {
            System.out.print("Donner un entier positif : ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Le nombre doit être strictement positif.");
            }
        } while (n <= 0);
        return n;
    }
  public static boolean estArmstrong(int n) {
    int tmp = n, somme = 0;
    while (tmp > 0) {
        int chiffre = tmp % 10;
        somme += chiffre * chiffre * chiffre;
        tmp /= 10;
    }
    return somme == n;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = lectureN();
        System.out.println("Les nombres d'Armstrong inférieurs à " + n + " sont : ");
        for (int i = 1; i < n; i++) {
            if (estArmstrong(i)) {
                System.out.println(i);
            }
        }
    }
}
