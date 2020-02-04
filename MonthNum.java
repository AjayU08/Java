import java.util.Scanner;

public class MonthNum {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Month number");
	int a=s.nextInt();
	if(a==1||a==3||a==5||a==7||a==7||a==8||a==10||a==12)
		System.out.println("No. of days is 31");
	else if (a==4||a==6||a==9||a==10)
		System.out.println("no. of days is 30");
	else 
		System.out.println("no. of days is 28/29");
}
}
