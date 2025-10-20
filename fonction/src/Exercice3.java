import java.util.Scanner;
public class Exercice3 {
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
    public static int calculeSomme(int n) {
        int somme = 0;
        for (int i = 1; i <= n; i++) {
            somme += i * i;
        }
        return somme;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = LectureN();
        System.out.println("Somme des " + n + " premiers carrés = " + calculeSomme(n));
    }
}
