import java.util.Scanner;
public class Arith {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a & b");
		double a=s.nextInt();
		double b=s.nextInt();
		double add = a+b;
		double sub = a-b;
		double mul = a*b;
		double div = a/b;
		double mod = a%b;
		System.out.println("Add: "+add);
		System.out.println("sub: "+sub);
		System.out.println("mul: "+mul);
		System.out.println("div: "+div);
		System.out.println("mod: "+mod);
		
		
	}
}
