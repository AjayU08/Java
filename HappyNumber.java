import java.util.Scanner;

public class HappyNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int a = s.nextInt();
		happy(a);
	}

	static void happy(int n) {
		while (n > 9) {
			int sum = 0;

			while (n != 0) {
				int m = n % 10;
				sum = sum + (m * m);
				n /= 10;
			}
			n = sum;
		}
		if(n==7||n==1)
			System.out.println(n+" is happy number");
		else
			System.out.println(n+" is not happy number");
	}
}
