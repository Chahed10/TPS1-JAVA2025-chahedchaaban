import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir vos coordonnées séparées par des virgules :");
        System.out.println("(Nom,Prénom,CIN,Date de naissance,Ville d'origine,Spécialité du bac,Année du bac)");
        
        String ligne = sc.nextLine();
        String[] infos = ligne.split(",");

        if (infos.length < 7) {
            System.out.println("Erreur : vous devez entrer 7 informations séparées par des virgules !");
            
        } else {
            System.out.println("\n---- Vos coordonnées ----");
            System.out.println("Votre nom est : " + infos[0].trim());
            System.out.println("Votre prénom est : " + infos[1].trim());
            System.out.println("Votre numéro de CIN est : " + infos[2].trim());
            System.out.println("Votre date de naissance est : " + infos[3].trim());
            System.out.println("Votre ville d'origine est : " + infos[4].trim());
            System.out.println("Votre spécialité de bac est : " + infos[5].trim());
            System.out.println("Vous avez obtenu votre bac en : " + infos[6].trim());
        }
    }
}
