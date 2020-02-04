import java.util.Scanner;
import java.util.Random;

public class DiGa {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		System.out.print("Enter first player name: ");
		String fir = s.next();
		System.out.println();
		System.out.print("Enter Second player name: ");
		String sec = s.next();
		System.out.println();
		int firto = 0;
		int secto = 0;
		while (true) {
			while (true) {
				System.out.println();
				System.out.println("Roll the Dice by pressing a: " + fir);
				char c = s.next().charAt(0);
				if (c == 'a') {
					int rd = r.nextInt(6) + 1;
					System.out.println("Dice value: " + rd);
					if(firto +rd<=20)
					firto = firto + rd;
					
					if (firto == 20) {
						System.out.println(fir + " won");
						return;
					}
					else {
						System.out.println("Total value: " + firto);
					}
					break;
				} 
				else {
					System.out.println("Invalid pressing, press a again");
				}
			}
			while (true) {
				System.out.println();
				System.out.println("Roll the Dice by pressing b: " + sec);
				char c = s.next().charAt(0);
				if (c == 'b') {
					int rd = r.nextInt(6) + 1;
					System.out.println("Dice value: " + rd);
					if(secto +rd<=20)
					secto = secto + rd;
					
					if (secto == 20) {
						System.out.println(sec + " won");
						return;
					}
					else {
						System.out.println("Total value: " + secto);
					}
					break;
				} 
				else {
					System.out.println("Invalid pressing, press b again");
				}
			}
		}
	}
}
