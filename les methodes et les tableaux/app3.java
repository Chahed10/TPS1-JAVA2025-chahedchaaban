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
    public static void RemplirTAB(int[] T, int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisie " + n + " entiers positifs:");
        for (int i = 0; i < n; i++) {
            do {

                System.out.print("Donner T[" + i + "] : ");
                T[i] = sc.nextInt();
            } while (T[i] <= 0);
        }
    }
    public static int[] CréerTpair(int[] T) {
        int cp = 0;
        for (int i = 0; i < T.length; i++) {
            if (T[i] % 2 == 0) {
                cp++;
            }
        }
        int[] T_pair = new int[cp];
        int j = 0;

        for (int i = 0; i < T.length; i++) {
            if (T[i] % 2 == 0) {
                T_pair[j] = T[i];
                j++;
            }
        }
        return T_pair;
    }
    public static int[] CréerTimpair(int[] T) {
        int ci = 0;
        for (int i = 0; i < T.length; i++) {
            if (T[i] % 2 != 0) {
                ci++;
            }
        }
        int[] T_impair = new int[ci];
        int j = 0;

        for (int i = 0; i < T.length; i++) {
            if (T[i] % 2 != 0) {
                T_impair[j] = T[i];
                j++;
            }
        }
        return T_impair;
    }

    public static void AfficheTAB(int[] T) {
        System.out.print(" ");
        for (int i = 0; i < T.length; i++) {
            System.out.print(T[i] );
        }
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = lectureN(sc);
        int[] T = new int[n];

        RemplirTAB(T, n);

        int[] T1 = CréerTpair(T);     
        int[] T2 = CréerTimpair(T);

        System.out.println("Tableau des pairs : ");
        AfficheTAB(T1);

        System.out.println("Tableau des impairs : ");
        AfficheTAB(T2);
    }
}
