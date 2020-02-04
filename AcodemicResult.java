import java.util.Scanner;
public class AcodemicResult {
	static void student(int a,int b,int c,int d) {
		int t=(a+b+c+d)/4;
		if(a<40||b<40||c<40||d<40)
		System.out.println("fail");
		else
		{
		if(t>40&&t<=50)
		System.out.println("pass");
		else if(t>50&&t<=60)
		System.out.println("second");
		else if(t>60&&t<75)
		System.out.println("first");
		else if(t>75&&t<100)
		System.out.println("Distinct");
		else
		System.out.println();

		}
	}	
	public static void main(String[] args)
	{
	System.out.println("Enter the marks of 4 Subjects");
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	int c=s.nextInt();
	int d=s.nextInt();
	student(a,b,c,d);
	}
	}

