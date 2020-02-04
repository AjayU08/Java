import java.util.Scanner;
public class Circle {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter radius");
		double r=s.nextInt();
		double a=3.14*r*r;
		double c=2*3.14*r;
		System.out.println("area: "+a);
		System.out.println("Circumference: "+c);
		
	}
}
