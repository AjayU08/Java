import java.util.Scanner;

public class ProDi {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		int t = n;
		int p = 1;
		while (n != 0) {
			int i = n % 10;
			p = p * i;
			n = n / 10;

		}
		System.out.println("Product: " + p);
	}
}
