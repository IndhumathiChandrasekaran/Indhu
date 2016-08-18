import java.util.Scanner;

public class EvenNum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Start :");
		int start = s.nextInt();
		System.out.println("End :");
		int end = s.nextInt();
		
		
		for (int i = start+1; i <= end; i++) {
			if(i%2==0)
			{
				System.out.println(i+ " is even");
			}

		}

	}
}
