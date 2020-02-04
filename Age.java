import java.util.Scanner;
public class Age
{
  public static void main(String[] args)
  {
     Scanner s=new Scanner(System.in);
     System.out.println("Enter your age:");
     int a=s.nextInt();
     System.out.println("Your age after five years: "+(a+5));
     System.out.println("Your age before five years: "+(a-5));
   }
}