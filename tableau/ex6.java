import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Entrez la taille du tableau : ");
            n = sc.nextInt();
        } while (n <= 0);

        int[] T = new int[n + 1];
        System.out.println("Saisissez les éléments:");
        for (int i = 0; i < n; i++) {
            T[i] = sc.nextInt();
        }

        System.out.print("Entrez la valeur à insérer: ");
        int x = sc.nextInt();

        int p;
        do {
            System.out.print("Entrez la position : ");
            p = sc.nextInt();
        } while (p < 1 || p > n);

        for (int i = n; i >= p; i--) {
            T[i] = T[i - 1];
        }
        T[p - 1] = x;

        System.out.println("Tableau après insertion:");
        for (int i = 0; i <= n; i++) {
            System.out.print(T[i] + " ");
        }
    }
}
