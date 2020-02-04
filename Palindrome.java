import java.util.Scanner;
class Palindrome{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int n=s.nextInt();
int t=n;
int p=0;
while(n!=0){
int i=n%10;
p=p*10+i;
n=n/10;

}
if(p==t){
System.out.println("Yes");
}
else{
System.out.println("no");
}
}
}