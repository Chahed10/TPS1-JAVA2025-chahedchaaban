import java.util.Scanner;
 public class Main{
 public static void main(String[] args) {
        dooble n1,n2,n3,c1,c2,c3,s,moy;
        int i;
        Scanner sc=new Scanner(System.In);
        System.out.println("donner c1");
        c1=sc.next.dooble();
        System.out.println("donner c2");
        c2=sc.next.dooble();
        System.out.println("donner c3");
        c3=sc.next.dooble();
        s=c1+c2+c3;
        for(i=0;i<10;i++){
            do{
                 System.out.println("donner n1");
                 n1=sc.next.dooble();
                
            } while((n1<=0)||(n1>=20));
                do{
                 System.out.println("donner n2");
                 n2=sc.next.dooble();
                
            } while ((n2<=0)||(n2>=20));
                do{
                 System.out.println("donner n3");
                 n3=sc.next.dooble();
                
            } while ((n3<=0)||(n3>=20)); 
                
            moy=((n1*c1)+(n2*c2)+(n3*c3))/s;
        }
        if(moy>=10){
            System.out.println("felecitation admis");
        }
        else{
            System.out.println("bon chance la prochane fois");
            
        }
        
    }
}