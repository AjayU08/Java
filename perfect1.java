
public class perfect1 {
	static boolean isperfect(int i){
		int s=0;
		for(int m=1;m<=i/2;m++) {
			if(i%m==0)
				s=s+m;
		}
		return s==i;
	}
	static void printperfect(int i){
		for(int m=1;m<=i;m++) {
			boolean b=isperfect(m);
			if(b==true)
				System.out.println(m);
		}
	}
	int countperfect(int i){
		int c=0;
		for(int m=1;m<=i;m++) {
			boolean b=isperfect(m);
			if(b==true)
				c++;
		}
		return c;

		
	}
	int sumperfect(int i){
		int s=0;
		for(int m=1;m<=i;m++) {
			boolean b=isperfect(m);
			if(b==true)
				s=s+m;
		}
		return s;

		
	}
	void printperfect(int i,int j){
		for(int m=i;m<=j;m++) {
			boolean b=isperfect(m);
			if(b==true)
				System.out.println(m);
		}

	}
}
