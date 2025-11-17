import java.util.Scanner;
public class app3 {
    public static int lectureN(Scanner sc) {
        int n;
        do {
            System.out.print("Entrez la taille du tableau : ");
            n = sc.nextInt();
        } while (n <= 0);
        return n;
    }

    public static void RemplirTAB(int[] T) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Saisissez les elements positifs:");
        for (int i = 0; i < T.length; i++) {
            do {
                T[i] = sc.nextInt();
            } while (T[i] < 0);
        }
    }
    public static int CréerTpair(int[] T, int[] T_pair) {
        int cp = 0; 
        for (int val : T) {
            if (val % 2 == 0) {
                T_pair[cp] = val;
                cp++;
            }
        }
        return cp; 
    }

    public static int CréerTimpair(int[] T, int[] T_impair) {
        int ci = 0; 
        for (int val : T) {
            if (val % 2 != 0) {
                T_impair[ci] = val;
                ci++;
            }
        }
        return ci; 
    }

    public static void AfficheTAB(int[] T, int taille, String nom) {
        System.out.print(nom + ": ");
        for (int i = 0; i < taille; i++) {
            System.out.print(T[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = lectureN(sc);
        int[] T = new int[n];

        RemplirTAB(T);

        int[] T_pair = new int[n];   
        int[] T_impair = new int[n]; 

        int cp = CréerTpair(T, T_pair);
        int ci = CréerTimpair(T, T_impair);

        AfficheTAB(T_pair, cp, "Tableau des pairs");
        AfficheTAB(T_impair, ci, "Tableau des impairs");
    }
}
