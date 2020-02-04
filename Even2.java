import java.util.Scanner;
class Even2
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
String[] str{"Even","Odd"};
System.out,println(str[a%2]);
}
}