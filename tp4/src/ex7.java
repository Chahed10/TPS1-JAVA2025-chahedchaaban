import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un entier : ");
        int n = sc.nextInt();

        String chaine = String.valueOf(n);
        System.out.println("L'entier converti en chaine est : " + chaine);
    }}