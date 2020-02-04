import java.util.Scanner;

public class eve {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int m=s.nextInt();
		System.out.print("Enter the Second val: ");
		int n=s.nextInt();
		int t=0,to=0;
		if(m<n) {
		for(int i=m;i<=n;i++) {
			if(i%2==0) {
				t=t+i;
			}
			else {
				to=to+i;
			}
		}
		System.out.println("Even sum: "+t);
		System.out.println("Odd sum: "+to);
		}
		else {
			for(int i=n;i<=m;i++) {
				if(i%2==0) {
					t=t+i;
				}
				else {
					to=to+i;
				}
			}
			System.out.println("Even sum: "+t);
			System.out.println("Odd sum: "+to);
		}
		}

}
