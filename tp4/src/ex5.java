import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un texte (max 50 caractères) : ");
        String texte = sc.nextLine();

        int compteur = 0;
        for (int i = 0; i < texte.length(); i++) {
            if (Character.isLowerCase(texte.charAt(i))) {
                compteur++;
            }
        }

        System.out.println("Nombre de lettres minuscules : " + compteur);
    }}
