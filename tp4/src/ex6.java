import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String verbe; 
        do {
            System.out.print("Entrez un verbe du premier groupe : ");
            verbe = sc.nextLine();
            if (!verbe.endsWith("er") || verbe.equals("aller")) {
                System.out.println(" Ce n'est pas un verbe régulier du premier groupe !");
            } else {
                String racine = verbe.substring(0, verbe.length() - 2);
                System.out.println("\n Conjugaison du verbe \"" + verbe + "\" au présent :");
                System.out.println("Je " + racine + "e");
                System.out.println("Tu " + racine + "es");
                System.out.println("Il/Elle " + racine + "e");
                System.out.println("Nous " + racine + "ons");
                System.out.println("Vous " + racine + "ez");
                System.out.println("Ils/Elles " + racine + "ent");
            }
            System.out.print("\nVoulez-vous conjuguer un autre verbe ? (oui/non) : ");
        } while (sc.nextLine().equalsIgnoreCase("oui"));

    }
}
