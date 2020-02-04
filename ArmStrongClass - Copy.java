
public class ArmStrongClass extends ArmStrongSub {
	public static void main(String[] args) {
		
		boolean b=isArmStrong(153);
		if(b==true)
			System.out.println("Yes");
		else
			System.out.println("No");
        System.out.println("******************************");
		printArmStrong(200);
		System.out.println("******************************");
		countArmStrong(200);
		System.out.println("******************************");
		SumOfArmStrong(200);
	}
}
