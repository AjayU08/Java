import java.util.Scanner;
class Even4
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
switch(n%2)
{
case 0: System.out.println("Even number");
break;
case 2: System.out.println("Odd Number");
break;
}
}
}