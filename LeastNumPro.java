package LogicBuilding;

import java.util.Arrays;
import java.util.Scanner;

public class LeastNumPro {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = s.nextInt();
		System.out.println("Enter the Key :");
		int key = s.nextInt();
		String str = "" + n;
		int[] num = new int[str.length()];
		for (int i = 0; i < str.length(); i++) {
			char[] ch = str.toCharArray();
			num[i] = Character.getNumericValue(ch[i]);
		}
		Arrays.sort(num);
		String ans = "";
		for (int i = 0; i < num.length - key; i++) {
			ans += num[i];
		}
		System.out.println(ans);
	}

}
