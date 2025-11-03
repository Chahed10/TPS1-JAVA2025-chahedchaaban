import java.util.Scanner;

public class app6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lignes;
        do {
            System.out.print("Enter the number of lines (>0) : ");
            lignes = sc.nextInt();
        } while (lignes <= 0);

        for (int i = 1; i <= lignes; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
