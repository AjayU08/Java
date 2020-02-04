import java.util.Scanner;
public class CharVowel {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Character");
		char c=s.next().charAt(0);
                                if((c>='A'&&c<='Z')||(c>='a'&&c<='z'))
{
		if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U')
			System.out.println("Vowel");
		else
			System.out.println("Consonant");
}
else 
System.out.println("Not a Alphabet");
	}
}
