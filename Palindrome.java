import java.util.Scanner;


public class Palindrome {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Number :");
	int num=s.nextInt();
	int n=num;
	int rev=0;
	while(num!=0)
	{
		int a=num%10;
		num=num/10;
		rev=(rev*10)+a;
	}
	if(n==rev)
	{
	System.out.println("Palindrome");
	}
	else
	{
	System.out.println("Not palindrome");	
	}
}
}
