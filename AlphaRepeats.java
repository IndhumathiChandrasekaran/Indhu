package LogicBuilding;

import java.util.Scanner;

public class AlphaRepeats {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		char[] ch = str.toCharArray();
		int count = 0;
		int rev = 0;
		String st = "";
		char c = 0;
		for (int i = 0; i < ch.length; i++) {
			if (Character.isAlphabetic(ch[i])) {
				c = ch[i];
				rev = 0;
				count = 0;
				if (i < str.length() - 2)
					if (Character.isDigit(ch[i + 1]) && Character.isDigit(ch[i + 2])) {
						rev = (Character.getNumericValue(ch[i + 1]) * 10) + Character.getNumericValue(ch[i + 2]);
						i+=2;
						count = 1;
					}
				if (count != 1)
					if (Character.isDigit(ch[i + 1])) {
						rev = Character.getNumericValue(ch[i + 1]);
					}
				for (int j = 0; j < rev; j++) {
					st += c;
				}
			}
		}
		System.out.println(st);
	}

}