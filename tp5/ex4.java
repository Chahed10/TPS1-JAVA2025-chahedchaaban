
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Entrer un nombre entier");
        int n =sc.nextInt();
        int somme=0;
        for (int i=1; i<=n; i++){
            somme=somme+1;
        }
        System.out.println("La somme des entiers de 1 à" +n+ "est : " +somme);
    }
    
}
