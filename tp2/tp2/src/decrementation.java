import java.util.Scanner;
public class decrementation{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.println("donner x=");
        x=sc.nextInt();
        System.out.println("donner y=");
        y=sc.nextInt();
        System.out.println("x="+x+"y="+y);
        x=y++;
        System.out.println("x="+x+"y="+y);
        x=++y;
        System.out.println("x="+x+"y="+y);
        y=x--;
        System.out.println("x="+x+"y="+y);
        y=--x;
        System.out.println("x="+x+"y="+y);
        
        
    }
}