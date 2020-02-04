import java.util.Scanner;
class Even3
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
if((a&1)==0)
{
System.out.println("Even number");
}
else
{
System.out.println("Odd Number");
}
}
}