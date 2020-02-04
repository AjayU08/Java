
public class DeseriumSub {
	int count(int n) {
		int c=0;
		do {
			n=n/10;
			c++;
		}while(n!=0);
		return c;
	}
	
	int pow(int n,int m) {
		int s=1;
		while(m>0) {
			s=s*n;	
			m--;
		}
		return s;
	}
	
	boolean isDeserium(int n){
		int d=count(n);
		int t=n,s=0,m;
		while(n!=0) {
			m=n%10;
			s=s+pow(m,d);
			n/=10;
			d--;
		}
		if(t==s)
			return true;
		else
			return false;
	}
	
	void printDeserium(int n){
		for(int i=1;i<=n;i++) {
			if(isDeserium(i)==true)
				System.out.println(i);
		}
	}
	
	void countDeserium(int n) {
		int c=0;
		for(int i=1;i<=n;i++) {
			if(isDeserium(i)==true)
				c++;
		}
		System.out.println(c);
	}
	
	void SumOfDeserium(int n) {
		int s=0;
		for(int i=1;i<=n;i++) {
			if(isDeserium(i)==true)
				s=s+i;
		}
		System.out.println(s);
	}
}
