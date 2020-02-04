import java.util.Scanner;

public class OddEve {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = s.nextInt();
		
		int t, c1 = 0, c2 = 0;
		while (n!= 0) {
			t = n % 10;
			if (t % 2 == 0) {
				c1++;
			} else {
				c2++;
			}

			n /= 10;
		}
		System.out.println("Even numbers: " + c1);
		System.out.println("Odd numbers:  " + c2);
	}

}
