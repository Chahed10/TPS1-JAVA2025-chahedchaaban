import java.util.Scanner;
public class app2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
        int i=0;
        do { 
            System.out.println("entrez le numero du mois (1 à 12)");
            n=sc.nextInt();
            
        } while ((n>12) ||(n<1));
            switch (n) {
                case 1:System.err.println("saison hiver");
                    break;
                    case 2: System.err.println("saison hiver");
                    break;
                    case 3: System.err.println("saison printemps");
                    break;
                    case 4:System.err.println("saison printemps");
                    break;
                    case 5:System.err.println("saison printemps");
                    break;
                    case 6:System.err.println("saison été");
                    break;
                    case 7:System.err.println("saison été");
                    break;
                    case 8:System.err.println("saison été");
                    break;
                    case 9:System.err.println("saison automne");
                    break;
                    case 10:System.err.println("saison automne");
                    break;
                    case 11:System.err.println("saison automne");
                    break;
                    case 12:System.err.println("saison hiver");
                    break;
                default:System.err.println("Erreur");
                    throw new AssertionError();
            }
            
                   
           
                
                     
                    

                    
                       
                    }
                }