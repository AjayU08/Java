import java.util.Scanner;
public class Perfect {
	public static void main(String[] args) {
		perfect1 p=new perfect1();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=s.nextInt();
		boolean rs=p.isperfect(a);
		System.out.println(rs);
		System.out.println("****************************************");
		
		p.printperfect(200);
		
		System.out.println("****************************************");
		
		int c=p.countperfect(100);
		System.out.println(c);
		
		System.out.println("****************************************");
		
		int f=p.sumperfect(300);
		System.out.println(s);
		
		System.out.println("****************************************");
		
		p.printperfect(1,200);
	}
}
