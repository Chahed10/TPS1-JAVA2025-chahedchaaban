import java.util.Scanner;
public class app4 {
    public static int lectureN(String message) {
            Scanner sc=new Scanner(System.in);

        int n;
        do {
            System.out.print(message);
            n = sc.nextInt();
        } while (n <= 0);
        return n;
    }
    public static void RemplirTAB(double[][] M, Scanner sc) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                System.out.print("M[" + i + "][" + j + "] = ");
                M[i][j] = sc.nextDouble();
            }
        }
    }
    public static double CalculSomme(double[][] M, int i) {
        double somme = 0;
        for (int j = 0; j < M[i].length; j++) {
            somme += M[i][j];
        }
        return somme;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = lectureN( "Entrez le nombre de lignes : ");
        int n2 = lectureN( "Entrez le nombre de colonnes : ");

        double[][] M = new double[n1][n2];
        RemplirTAB(M, sc);

        System.out.println("\nSomme des lignes:");
        for (int i = 0; i < n1; i++) {
            double somme = CalculSomme(M, i);
            System.out.println("Ligne " + i + ": " + somme);
        }
    }
}
