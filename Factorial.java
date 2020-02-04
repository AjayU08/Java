import java.util.Scanner;
public class Factorial {
	static void fact(int n) {
		int f=1;
		if(n>0) {
			for(int i=1;i<=n;i++) {
				f=f*i;
			}
			System.out.println("Factorial of n is "+f);
		}
		if(n==0)
			System.out.println("Factorial of n is 1");
		
	}
	public static void main(String[] args) {
		System.out.print("Enter the number: ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		fact(n);
	}
}
