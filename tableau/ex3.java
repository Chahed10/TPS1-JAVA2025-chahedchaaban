import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Entrez la taille du tableau ");
            n = sc.nextInt();
        } while (n <= 0);

        int[] T = new int[n];
        System.out.println("Saisissez les elements du tableau:");
        for (int i = 0; i < n; i++) {
            T[i] = sc.nextInt();
        }

        System.out.print("Entrez l'entier X à rechercher: ");
        int X = sc.nextInt();
        int occ = 0;

        for (int val : T) {
            if (val == X) {
            occ++;
        }}

        if (occ > 0) {
            System.out.println("X existe dans le tableau.");
            System.out.println("Nombre d'occurrences: " + occ);
        } else {
            System.out.println("X n'existe pas dans le tableau.");
        }
    }
}
