import java.util.Scanner;

public class EvenOdd {
	void evon(int m, int n) {
		int j = 0;
		if (m % 2 == 0) {
			for (int i = m; i <= n; i++) {
				j = j + i;
				i++;
			}
			System.out.println("sum of even numbers:" + j);
			for (int i = m + 1; i <= n; i++) {
				j = j + i;
				i++;
			}
			System.out.println("sum of even numbers:" + j);
		}
	}

	public static void main(String[] args) {
		EvenOdd p = new EvenOdd();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int m = s.nextInt();
		int n = s.nextInt();
		p.evon(m, n);
	}
}
