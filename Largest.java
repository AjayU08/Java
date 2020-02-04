import java.util.Scanner;
class Largest
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter three numbers");
int x=s.nextInt();
int y=s.nextInt();
int z=s.nextInt();
if(x>y&&x>z)
System.out.println("Largest number is: "+x);
else if(y>z)
System.out.println("Largest number is: "+y);
else
System.out.println("Largest number is: "+z);

}
}