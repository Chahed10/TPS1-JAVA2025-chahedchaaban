
import java.util.StringTokenizer;

public class ex3 {
    public static void main(String[] args) {
        String phrase="Java est amusant";
        StringBuffer sb=new StringBuffer(phrase);
        sb.reverse();
        System.out.println("phrase inverée:" +sb);
        StringTokenizer st=new StringTokenizer(phrase,"");
        int compteur=0;
        while (st.hasMoreElements()) {
            String mot =  st.nextToken();
            compteur++;
        }
        System.out.println("Nombre de mots :" + compteur);
    }
    
}
