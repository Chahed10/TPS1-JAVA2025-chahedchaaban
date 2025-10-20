import java.util.Scanner;
public class Exercice5 {
    public static double puissance(double x, int N) {
        double p = 1;
        for (int i = 1; i <= N; i++) {
            p *= x;
        }
        return p;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Donner x un réel : ");
        double x = sc.nextDouble();
        System.out.print("Donner N un entier positif : ");
        int N = sc.nextInt();
        System.out.println(x + "^" + N + " = " + puissance(x, N));
    }
}
