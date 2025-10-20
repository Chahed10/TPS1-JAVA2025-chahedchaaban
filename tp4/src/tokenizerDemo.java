import java.util.Scanner;
import java.util.StringTokenizer;

public class tokenizerDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String texte1 ="Bonjour les Etudiants, bienveneu en Java!";
        StringTokenizer st1 = new StringTokenizer(texte1);
        System.out.println("Decoupage du texte en mots :");
          while (st1.hasMoreElements()) {
            System.out.println(st1.nextToken());
          }
            System.out.println("Le texte principale est:" +texte1);
        }
    }
    

