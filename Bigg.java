import java.util.Scanner;

public class Bigg {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 4 numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int d=s.nextInt();
		if(a>b&&a>c&&a>d)
			System.out.println("Biggest no.: "+a);
		else if(b>c&&b>d)
			System.out.println("Biggest no.: "+b);
		else if (c>d)
			System.out.println("Biggest no.: "+c);
		else
			System.out.println("Biggest no.: "+d);
	}
}
