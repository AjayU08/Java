import java.util.Scanner;
public class DigCou {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int count=0;
		do {
			n=n/10;
			count++;
		}while(n!=0);
		System.out.println("Total digits: "+count);
	}

}
