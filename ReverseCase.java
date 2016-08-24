package LogicBuilding;
import java.util.Scanner;
public class ReverseCase {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String[] st = str.split(" ");
		String ans = "";
		int k = 0;
		for (int i = 0; i < st.length; i++) {
			k = st[i].length() - 1;
			char[] ch = st[i].toCharArray();
			for (int j = 0; j < st[i].length(); j++) {
				if (Character.isUpperCase(ch[j])) {
					ans += Character.toUpperCase(ch[k]);
				} else if (Character.isLowerCase(ch[j])) {
					ans += Character.toLowerCase(ch[k]);
				}
				k--;
			}
			ans += " ";
		}
		ans=ans.trim();
		System.out.println(ans);

	}
}
