import java.util.Scanner;
public class MethSumPrime {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number upto the prime number to display:");
		int a = s.nextInt();
		int j=0;
		for (int i = 2; i <= a; i++) {
			boolean b = isprime(i);
			if (b == true) {
				System.out.println(i);
				j=j+i;
			}
		}
		System.out.println("Sum of prime numbers is "+j);
	}
	static boolean isprime(int n) {
	    for(int m=2;m<=n/2;m++) {
	    	if(n%m==0)
	    		return false;
	    }
		return true;
	}

}


