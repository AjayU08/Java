import java.util.Scanner;

public class MethPrime {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number upto the prime number to display:");
		int a = s.nextInt();
		for (int i = 2; i <= a; i++) {
			boolean b = isprime(i);
			if (b == true) {
				System.out.println(i);
			}
		}
	}
	static boolean isprime(int n) {
		int m=2;
		while (m<=n/2) {
			if(n%m==0)
				return false;
			else
				m++;
		}
		return true;
	}

}
