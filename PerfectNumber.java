import java.util.Scanner;
public class PerfectNumber {
	static boolean perNum(int n) {
		int i,p=0;
		for(i=1;i<=n/2;i++) {
			if(n%i==0) {
				p=p+i;
			}		
		}
		if(p==n) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=s.nextInt();
		boolean b=perNum(a);
		System.out.println(b);
	}
}
