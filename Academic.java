import java.util.Scanner;

public class Academic {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Academic Details");
		System.out.println("Enter name");
		String str=s.nextLine();
		System.out.println("Enter 10%");
		double d10=s.nextDouble();
		System.out.println("Enter 12%");
		double d12=s.nextDouble();
		System.out.println("Enter B.E %");
		String srt=s.next();
		System.out.println("Name: "+str);
		System.out.println("10th marks: "+d10+"%");
		System.out.println("12th marks: "+d12+"%");
		System.out.println("B.E. marks: "+srt+" CGPA");
	}
}
