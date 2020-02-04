
public class DeseriumClass {
	public static void main(String[] args) {
		DeseriumSub a = new DeseriumSub();
		boolean b=a.isDeserium(175);
		if(b==true)
			System.out.println("Yes");
		else
			System.out.println("No");
        System.out.println("******************************");
		a.printDeserium(200);
		System.out.println("******************************");
		a.countDeserium(200);
		System.out.println("******************************");
		a.SumOfDeserium(200);
	}
}
