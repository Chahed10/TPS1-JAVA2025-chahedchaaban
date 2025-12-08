import java.util.Scanner;

public class app3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;

        do {
            System.out.print("Entrez n1 : ");
            n1 = sc.nextInt();
        } while (n1 <= 0 || n1 > 20);

        do {
            System.out.print("Entrez n2 : ");
            n2 = sc.nextInt();
        } while (n2 <= 0 || n2 > 30);

        int[][] M = new int[n1][n2];
        int[] T = new int[n1];

        System.out.println("Remplissez la matrice M:");
        for (int i = 0; i < n1; i++) {
            int sommeLigne = 0;
            for (int j = 0; j < n2; j++) {
                System.out.print("M[" + i + "][" + j + "] = ");
                M[i][j] = sc.nextInt(); 
                sommeLigne += M[i][j];
            }
            T[i] = sommeLigne;
        }

        int min = T[0], max = T[0];
        for (int i = 0; i < n1; i++) {
            if (T[i] < min) min = T[i];
            if (T[i] > max) max = T[i];
        }

        System.out.println("Sommes des lignes:");
        for (int i = 0; i < n1; i++) {
            System.out.println("Ligne " + i + ": " + T[i]);
        }

        System.out.println("Minimum des sommes: " + min);
        System.out.println("Maximum des sommes: " + max);
    }
}
