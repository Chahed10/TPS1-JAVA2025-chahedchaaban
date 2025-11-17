import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("Entrez la taille du tableau : ");
            n = sc.nextInt();
        } while (n <= 0);

        int[] T = new int[n];
        System.out.println("Saisissez les éléments ");
        
        for (int i = 0; i < n; i++) {
            T[i] = sc.nextInt();
        }

        int cp = 0, cip = 0;
        for (int i = 0; i < n; i++) {
            if (T[i] % 2 == 0)
                cp++;  
            else
                cip++;  
        }
        int[] T1 = new int[cp];   
        int[] T2 = new int[cip]; 

        int ip = 0, iip = 0;
        for (int i = 0; i < n; i++) {
            if (T[i] % 2 == 0) {
                T1[ip] = T[i];
                ip++;
            } else {
                T2[iip] = T[i];
                iip++;
            }
        }
        System.out.print("Valeurs paires : ");
        for (int i = 0; i < cp; i++) {
            System.out.print(T1[i] + " ");
        }
        System.out.print("Valeurs impaires : ");
        for (int i = 0; i < cip; i++) {
            System.out.print(T2[i] + " ");
        }
    }
}
