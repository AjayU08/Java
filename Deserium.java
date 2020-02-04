import java.util.Scanner;
class Deserium 
{
	static boolean isDeserium(int n)
	{
		int d=numOfDigits(n);
		int sum=0,t=n;
		while(n!=0)
		{
			int m=n%10;
			sum=sum+pow(m,d);
			n/=10;
			d--;
		}
		return sum==t;
	}
	static int pow(int m,int n)
	{
		int p=1;
		while(n>0)
		{
			p=p*m;
			n--;
		}
		return p;
	}
	static int numOfDigits(int n)
	{
		int c=0;
		do
		{
			n/=10;
			c++;
		}while(n!=0);
		return c;
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int a=s.nextInt();
		boolean b=isDeserium(a);
		if(b==true)
			System.out.println(a+" is Deserium number");
		else
			System.out.println(a+" is not Deserium number");

	}
}
