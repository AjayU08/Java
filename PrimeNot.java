import java.util.Scanner;

public class PrimeNot {
	static boolean primeNot(int n) {
		int count = 1;
		int i = 1;
		while (i <= n / 2) {
			if (n % i == 0) {
				count++;
				i++;
			}
		}
		if(count==2)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = s.nextInt();
		boolean b = primeNot(n);
		if(b==true)
			System.out.println(n+" is Prime Number");
		else
			System.out.println(n+" is not Prime Number");
	}
}
