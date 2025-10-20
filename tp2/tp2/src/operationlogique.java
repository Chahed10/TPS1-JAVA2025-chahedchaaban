public class operationlogique{
    public static void main (String[] args) {
        int a=6,b=21;
        boolean res;
        res=a>b;
        System.out.println("a>b?"+res);
        res=!(a>b);
        System.out.println("!(a>b)?"+res);
        res=a<b;
        System.out.println("a<b?"+res);
        res=a==b;
        System.out.println("a==b?"+res);
        res=a!=b;
        System.out.println("a!=b?"+res);
        res=(a<b)&(a==b);
        System.out.println("(a<b)&(a==b)"+res);
        res=(a<b)|(a==b);
        System.out.println("(a<b)|(a==b)"+res);
        res=(a<b)^(a==b);
        System.out.println("(a<b)^(a==b)"+res);
        res=a<b?true:false;
        System.out.println("a<b?true:false"+res);
    }
}