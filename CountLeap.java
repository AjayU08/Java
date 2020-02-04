import java.util.Scanner;
public class CountLeap {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the year");
		int i=3100;
		int n=s.nextInt();;
		int count=0;
		if(n<i) {
		while(n<=i) {
			if((n%400==0)||(n%4==0&&n%100!=0)){
				count++;
			}
			n++;
		}
		}
		System.out.println("Number of leap years: "+count);
	}
}
