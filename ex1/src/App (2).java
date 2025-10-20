import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double note1, note2, note3;
        int coef1, coef2, coef3;
        int i=0;
        do {
            System.out.print("Entrez la 1ère note : ");
            note1 = sc.nextDouble();
            System.out.print("Entrez son coefficient : ");
            coef1 = sc.nextInt();
            i++;
        }while (note1 <=0 || note1>=20) ;

            do{
            System.out.print("Entrez la 2ème note : ");
            note2 = sc.nextDouble();
            System.out.print("Entrez son coefficient : ");
            coef2 = sc.nextInt();
            i++;
            }while(note2 <=0 || note2>=20) ;

            do{
            System.out.print("Entrez la 3ème note : ");
            note3 = sc.nextDouble();
            System.out.print("Entrez son coefficient : ");
            coef3 = sc.nextInt();
            i++;
            }while (note3 <=0 || note3>=20) ;

        for ( i=0 ; i<10 ; i++){
            double sommeNotes = (note1 * coef1) + (note2 * coef2) + (note3 * coef3);
            int sommeCoef = coef1 + coef2 + coef3;
            double moyenne = sommeNotes / sommeCoef;
            System.out.println("La moyenne de l'étudiant est : " + moyenne);
            if (moyenne >= 10) {
                System.out.println (" Félicitations ! L'étudiant est admis.");
            } else {
                System.out.println(" Désolé, l'étudiant n'est pas admis.");
            }
        }
        sc.close();
    }
    }

        
        


