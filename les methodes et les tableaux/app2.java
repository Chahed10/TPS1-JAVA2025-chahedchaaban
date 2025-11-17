import java.util.Scanner;
public class app2 {
    public static int lectureN(Scanner sc) {
        int n;
        do {
            System.out.print("Entrez le nombre de notes : ");
            n = sc.nextInt();
        } while (n < 10);
        return n;
    }

    public static void RemplirTAB(double[] T) {
    Scanner sc=new Scanner(System.in);
     System.out.println("Saisissez les notes :");
        for (int i = 0; i < T.length; i++) {
            do {
                T[i] = sc.nextDouble();
            } while (T[i] < 0 || T[i] > 20);
        }
    }
    public static double Calcul_Moy(double[] T) {
        double somme = 0;
        for (double note : T) {
            somme += note;
        }
        return somme / T.length;
    }

    public static int NombreNote(double[] T, double moyenne) {
        int count = 0;
        for (double note : T) {
            if (note > moyenne) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = lectureN(sc);
        double[] T = new double[n];

        RemplirTAB(T);
        double moyenne = Calcul_Moy(T);
        int nbSup = NombreNote(T, moyenne);

        System.out.println("Moyenne de la classe: " + moyenne);
        System.out.println("Nombre de notes supérieures à la moyenne: " + nbSup);
    }
}
