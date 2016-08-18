import java.util.Scanner;

public class EvenNum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Start :");
		int start = s.nextInt();
		System.out.println("End :");
		int end = s.nextInt();
		
		
		for (int i = start; i <= end; i++) {
			int j;
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					break;
				}
			}
			if (i == j) {
				System.out.println(i + " prime");
			}

		}

	}
}
