import java.util.Scanner;
class BodyMass
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter body mass(kg) and Height(meters)");
double w=s.nextDouble();
double h=s.nextDouble();
int feet=(int)h;
int inch=(int)((h-feet)*10);
double m=((feet*12)+inch)*0.0254;
double bmi=w/(m*m);
System.out.println("Body Mass Index: "+ bmi);
}
}