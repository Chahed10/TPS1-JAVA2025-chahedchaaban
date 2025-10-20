import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez une chaine : ");
        String ch = sc.nextLine();
        StringBuilder code = new StringBuilder();
        for (int i = 0; i < ch.length(); i++) {
            char c = ch.charAt(i);
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                c = (char) ((c - base + 3) % 26 + base);
            }
            code.append(c);
        }

        System.out.println("Texte codé : " + code);
    }
}
