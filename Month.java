import java.util.Scanner;

public class Month {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Month number");
		int m=s.nextInt();
		if(m<=12&&m>0) {
			System.out.println("Month is present");
		}
		else
			System.out.println("Month is not present");
	}
}
