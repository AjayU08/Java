import java.util.Scanner;

public class Cou35 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=s.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			if(i%5==0&&i%3==0) {
				count++;
			}
			else {
				
			}
		}
		System.out.println("Total count: "+count);
	}
}
