import java.util.Scanner;
public class FactOfN {
	static int fact(int z) {
		int f=1;
		while(z>1) {
			f=f*z;
			z--;
		}
		return f;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println(i+"! = "+fact(i));
		}
	}

}
