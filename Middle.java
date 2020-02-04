import java.util.Scanner;
class Middle
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter three numbers");
int x=s.nextInt();
int y=s.nextInt();
int z=s.nextInt();
if((x>y&&x<z)||(x>z&&x<y))
System.out.println("Middle number is: "+x);
else if((y>x&&y<z)||(y>z&&y<z))
System.out.println("Middle number is: "+y);
else
System.out.println("Middle number is: "+z);

}
}