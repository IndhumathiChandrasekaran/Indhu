import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Number :");
		int num = s.nextInt();
        int arms=0;int n=num;
		while(num!=0)
		{
			int a=num%10;
			num=num/10;
			arms+=Math.pow(a, 3);
		}
		if(n==arms)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}

		

	}
}
