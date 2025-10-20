import java.util.Scanner;
public class Exercice6 {
    public static long FACT(int N) {
        if (N == 0)
            return 1;
        long fact = 1;
        for (int i = 1; i <= N; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Donner un entier N : ");
        int N = sc.nextInt();
        System.out.println("Factorielle de " + N + " = " + FACT(N));
        
    }
}
