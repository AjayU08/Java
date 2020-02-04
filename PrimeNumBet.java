import java.util.Scanner;
public class PrimeNumBet {
	public static void main(String[] args) {
		System.out.println("Enter digits to print prime number");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		for(int i=a;i<=b;i++) {
			boolean c=isprime(i);
			if(c==true)
				System.out.println(i);
		}
	}
	static boolean isprime(int n) {
	    for(int m=2;m<=n/2;m++) {
	    	if(n%m==0)
	    		return false;
	    }
		return true;
	}
}
