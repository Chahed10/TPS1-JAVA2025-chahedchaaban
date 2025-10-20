import java.util.*;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez une phrase : ");
        String phrase = sc.nextLine();
        String[] mots = phrase.split("\\s+");
        System.out.println("Nombre de mots : " + mots.length);
        for (String mot : mots) {
            mot = mot.toLowerCase();
        }
        System.out.println("Occurrences de chaque mot :");   
        }}