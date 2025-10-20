import java.util.Scanner;
public class app1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int tp;
        System.err.println("donner une temperature");
        tp=sc.nextInt();
        if (tp<0){
            System.err.println("c'est glace");

        }else{
            if(tp>=0 & tp<=100 ){
                System.err.println("c'est l'eau");
            }else{
                if (tp>100){
                    System.err.println("c'est vapeur");
                }
            }
        }
    }}