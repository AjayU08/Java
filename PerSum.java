import java.util.Scanner;
public class PerSum {
	static void perfect(int n) {
		int s=0,t=n,p=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				s=s+i;
			}
		}
		if(s==t)
			p=p+s;
		System.out.println(p);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		perfect(a);
	}
}
