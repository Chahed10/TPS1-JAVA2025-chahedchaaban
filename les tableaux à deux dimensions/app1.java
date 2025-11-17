import java.util.Scanner;

public class app1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nl, nc;

        do {
            System.out.print("Entrez le nombre de lignes ");
            nl = sc.nextInt();
        } while (nl <= 0 || nl >= 50);

        do {
            System.out.print("Entrez le nombre de colonnes ");
            nc = sc.nextInt();
        } while (nc <= 0 || nc >= 50);

        int[][] M = new int[nl][nc];

        System.out.println("Remplissez la matrice avec des entiers pairs:");
        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                int val;
                do {
                    System.out.print("M[" + i + "][" + j + "] = ");
                    val = sc.nextInt();
                } while (val % 2 != 0);
                M[i][j] = val;
            }
        }

        System.out.print("Entrez l'entier pair X à rechercher: ");
        int X = sc.nextInt();

        boolean test= false;
        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                if (M[i][j] == X) {
                    test = true;
                    break;
                }
            }
        }
        if (test=true){
            System.out.println( "X existe dans la matrice." );
        }else{
            System.out.println( "X n'existe pas dans la matrice." );
        }

        
    }
}
