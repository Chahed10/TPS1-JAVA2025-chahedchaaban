import java.util.Scanner;
public class Exercice2 {
    public static int LectureN() {
     Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Donner un entier positif : ");
            n = sc.nextInt();
            if (n < 0) {
                System.out.println("Le nombre doit être positif !");
            }
        } while (n < 0);
        return n;
    }
    public static int Compteur(int n) {
        int compteur = 0;
        while ( n > 0) {
            compteur++;
            n /= 10;
        }
        return compteur;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = LectureN();
        System.out.println("Nombre de chiffres = " + Compteur(n));
    }
}
