import java.util.Scanner;
public class PersonAge {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Person's Age");
		int age=s.nextInt();
		if(age>=0) {
			System.out.println("Person can Vote");
		}
		else
			System.out.println("Person can't vote");
	}

}
