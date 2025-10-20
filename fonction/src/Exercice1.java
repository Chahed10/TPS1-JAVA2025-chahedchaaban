import java.util.Scanner;
public class Exercice1 {
    public static int LectureN() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Donner un entier positif : ");
            n = sc.nextInt();
            if (n < 0) {
                System.out.println("Le nombre doit être positif !");
            }
        } while (n < 0);
        return n;
    }
    public static boolean EstPair(int n) {
        if(n%2==0){
        return true;
        }else{
            return false;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = LectureN();
        if (EstPair(n)==true) {
            System.out.println(n+" est paire");
        } 
    }
}
