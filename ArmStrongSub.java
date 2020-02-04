
public class ArmStrongSub {
	 static boolean isArmStrong(int n) {
		int s = 0, t = n, m;
		while (n != 0) {
			m = n % 10;
			s = s + (m*m*m);
			n /= 10;
		}
		if (s == t)
			return true;
		else
			return false;
	}

	static void printArmStrong(int n) {
		for (int i = 1; i <= n; i++) {
			if (isArmStrong(i) == true)
				System.out.println(i);
		}
	}

	static void countArmStrong(int n) {
		int c = 0;
		for (int i = 1; i <= n; i++) {
			if (isArmStrong(i) == true)
				c++;
		}
		System.out.println(c);
	}

	static void SumOfArmStrong(int n) {
		int s=0;
		for (int i = 1; i <= n; i++) {
			if (isArmStrong(i) == true)
				s=s+i;
		}
		System.out.println(s);
	}
}
