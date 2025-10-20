import java.util.Scanner;

public class sisirbuffer {
     public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Veuillez saisir une phrase :");
        String ch2=sc.nextLine();
        StringBuffer ch = new StringBuffer(ch2);
        System.out.println("le contenu du stringBuffer est : " +ch);
        sc.close();
     }}