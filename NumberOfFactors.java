import java.util.Scanner;

public class NumberOfFactors {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
			int i=1,p=1;
			while(i<=n/2){
				if(n%i==0) 
			                 p++;
                                                                 i++;
				
			}
			System.out.println("Number of factors of divisor: "+p);
		}
	}