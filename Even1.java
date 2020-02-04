import java.util.Scanner;
class Even1
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
if(a%2==0||((a/2)*2==a))
{
System.out.println("Even number");
}
else
{
System.out.println("Odd Number");
}
}
}