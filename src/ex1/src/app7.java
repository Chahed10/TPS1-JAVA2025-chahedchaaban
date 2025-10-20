import java.util.Scanner;
public class app7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Entrez un entier non nul : ");
            n = sc.nextInt();
        } while (n == 0);

        if (n % 2 == 0) {
            System.out.println(n + " est pair");
        } else {
            System.out.println(n + " est impair");
        }


    }
}
