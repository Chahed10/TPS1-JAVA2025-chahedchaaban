import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Entrez la taille du tableau : ");
            n = sc.nextInt();
        } while (n <= 5);

        double[] T = new double[n];
        System.out.println("Saisissez les éléments:");
        for (int i = 0; i < n; i++) {
            T[i] = sc.nextDouble();
        }

        System.out.println("Tableau après décalage à gauche:");
        for (int i = 0; i < n - 1; i++) {
            T[i] = T[i + 1];
        }
        
        for (double val : T) {
            System.out.print(val + " ");
        }
    }
}
