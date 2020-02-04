import java.util.Scanner;

public class PreNum {
	static boolean preNum(int n) {
		int i=1,c=1;
		while(i<=n/2) {
			if(n%i==0)
				c++;
			i++;
		}
		if(c==2)
			return true;
		else
			return false;
		
		
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=s.nextInt();
		boolean b=preNum(a);
		if(b==true)
			System.out.println(a+" is a prime number");
		else
			System.out.println(a+" is not a prime number");
	}
}
