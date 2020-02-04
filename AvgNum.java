import java.util.Scanner;

public class AvgNum {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int t,to=0;
		while(n!=0) {
			t=n%10;
			to=to+t;
			n/=10;
		}
		System.out.println(to);
	}
}
