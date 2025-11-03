import java.util.Scanner;
public class app3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x;
        int i=0;
        do { 
            System.err.println("entrez un nombre compris entre 1 et 10");
            x=sc.nextInt();
            i++;
        } while ((x<1)|| (x>10));

        System.err.println("table de multiplication de"+x);
        for ( i=1 ; i<=10 ; i++) {
            System.err.println ( x+"*"+i+"="+(x*i));
        }
    }}