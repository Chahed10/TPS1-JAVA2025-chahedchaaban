import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Entrez le nombre de notes : ");
            n = sc.nextInt();
        } while (n < 10);

        double[] T = new double[n];
        double somme = 0;

        System.out.println("Saisissez les notes :");
        for (int i = 0; i < n; i++) {
            do {
                T[i] = sc.nextDouble();
            } while (T[i] < 0 || T[i] > 20);
            somme += T[i];
        }

        double moyenne = somme / n;
        int count = 0;
        for (double note : T) {
            if (note > moyenne) count++;
        }

        System.out.println("Moyenne de la classe: " + moyenne);
        System.out.println("Nombre de notes supérieures à la moyenne: " + count);
    }
}
