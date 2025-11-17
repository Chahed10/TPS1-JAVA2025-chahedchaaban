import java.util.Scanner;
public class app1 {

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
        System.out.println("Saisissez les elements du tableau:");
        for (int i = 0; i < T.length; i++) {
            T[i] = sc.nextInt();
        }
    }

    public static void Remplacer(int[] T, int X1, int X2) {
        for (int i = 0; i < T.length; i++) {
            if (T[i] == X1) {
                T[i] = X2;
            }
        }
    }

    public static void AfficheTAB(int[] T) {
        System.out.print("Contenu du tableau: ");
        for (int val : T) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = lectureN(sc);
        int[] T = new int[n];

        RemplirTAB(T);

        System.out.print("Entrez X1 à remplacer: ");
        int X1 = sc.nextInt();
        System.out.print("Entrez X2 remplaçant: ");
        int X2 = sc.nextInt();

        Remplacer(T, X1, X2);
        AfficheTAB(T);
    }
}
