import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Entrez la taille du tableau : ");
            n = sc.nextInt();
        } while (n <= 0);

        int[] T = new int[n];
        System.out.println("Saisissez les éléments:");
        for (int i = 0; i < n; i++) {
            T[i] = sc.nextInt();
        }

        int p;
        do {
            System.out.print("Entrez la position à supprimer : ");
            p = sc.nextInt();
        } while (p < 1 || p > n);

        for (int i = p - 1; i < n - 1; i++) {
            T[i] = T[i + 1];
        }

        System.out.println("Tableau après suppression:");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(T[i] + " ");
        }
    }
}
