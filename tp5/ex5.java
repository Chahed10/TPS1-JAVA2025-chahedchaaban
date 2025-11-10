import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez une phrase : ");
        String phrase = sc.nextLine();

        String[] mots = phrase.split(" ");
        int nbMots = mots.length;

        int nbVoyelles = 0;
        String motLong = "";

        for (int i = 0; i < mots.length; i++) {
            String mot = mots[i];

            for (int j = 0; j < mot.length(); j++) {
                char c = Character.toLowerCase(mot.charAt(j));
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') {
                    nbVoyelles++;
                }
            }
            if (mot.length() <= motLong.length()) { 
                motLong = mot;
            }
        }
        System.out.println("Nombre de mots : " + nbMots);
        System.out.println("Nombre de voyelles : " + nbVoyelles);
        System.out.println("Le mot le plus long est : " + motLong);
    }
}
