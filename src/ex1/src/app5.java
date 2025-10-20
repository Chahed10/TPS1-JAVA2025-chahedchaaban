import java.util.Scanner;

public class app5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("De quel mois s'agit-il ? (1-12) : ");
        int mois = sc.nextInt();

        if (mois < 1 || mois > 12) {
            System.out.println("Impossible, ce mois n'existe pas");
        }
        System.out.print("De quelle année ? : ");
        int annee = sc.nextInt();
        int jours = 0;
        switch (mois) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                jours = 31;
                break;
            case 4: case 6: case 9: case 11:
                jours = 30;
                break;
            case 2:
                if ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)) {
                    jours = 29;
                } else {
                    jours = 28;
                }
                break;
        }

        System.out.println("En " + annee + ", le mois " + mois + " a " + jours + " jours.");
        
        
    }
}
