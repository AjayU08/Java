import java.util.Scanner;
public class PerfectNum {
	void perf(int n) {
		int i,f,p=0;
		for(i=1;i<=n/2;i++) {
			if(n%i==0) {
				p=p+i;
			}		
		}
		if(p==n) {
			System.out.println("Perfect Number");
		}
		else {
			System.out.println("Not perfect number");
		}
	}
	public static void main(String[] args) {
		PerfectNum p=new PerfectNum();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=s.nextInt();
		p.perf(n);
	}
}
