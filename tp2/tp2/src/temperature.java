import java.util.Scanner;
public class temperature
{
	public static void main(String[] args) {
	    Double t;
	    Scanner sc=new Scanner(System.in);
		System.out.println("doner la tempurature en celsius");
		t=sc.nextDouble();
		t=t+273.15;
		System.out.println("la tempurature est"+t+"k");
	}
}
