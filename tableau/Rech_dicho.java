import java.util.Scanner;

public class Rech_dicho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T[] = new int[10]; 
        int n = T.length;
        int inf, sup, x, mil;
        System.out.println("Donner X :");
        x = sc.nextInt();
           inf=1;
            sup=n;
        do{  
            mil = (inf + sup) / 2;

            if (T[mil] == x) {
             
             sup=mil-1;
            } 
            else {
                inf = mil + 1;
            }
        }while((T[mil]==x || inf<sup)); 
}}
