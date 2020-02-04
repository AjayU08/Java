import java.util.Scanner;

public class ArmStrong {
	static void armStrong(int n) {
		int t=n,s=0;
		while(n!=0) {
			int m=n%10;
			s=s+m*m*m;
			n/=10;
		}
		if(s==t)
			System.out.println(t+ " is a armstrong number");
		else
			System.out.println(t+ " is not a armstrong number");
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = s.nextInt();
		armStrong(a);
	}
}
