import java.util.Scanner;
public class PrimeOrNot {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int i=s.nextInt();
		int p=0;
		for(int n=2;n<=i/2;n++) {
			if(i%n==0) {
				p=1;
			}
		}
		if(p==1) {
			System.out.println(i+" is not Prime");
		}
		else {
			System.out.println((i+" is Prime");
		}
	}
}
