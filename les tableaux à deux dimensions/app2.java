import java.util.Scanner;

public class app2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nl, nc;
        
 do {
          System.out.print("n1 = ");
        nl = sc.nextInt();
        System.out.print("n2 = ");
        nc = sc.nextInt();
        } while (nl <= 0 || nl >= 30 || nc <= 0 || nc >= 30);
       
        int[][] M = new int[nl][nc];
        double s = 0;
        double p = 1;

        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                M[i][j] = sc.nextInt();
                s += M[i][j];
                p *= M[i][j];
            }
        }

        double moy =  s / (nl * nc);

      System.out.println("Somme = " +s);
      System.out.println("produit = " +p);
      System.out.println("Moyenne = " +moy);
}
}