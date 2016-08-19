package LogicBuilding;

import java.util.Scanner;

public class CamelCase {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String st=s.nextLine();
		String[] str=st.split(" ");
		String[] s1=new String[str.length];
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<1;j++)
			{
				s1[i]=str[i].substring(0,1).toUpperCase();
				s1[i]+=str[i].substring(1).toLowerCase();
			}
		}
		String res="";
		for(int i=0;i<s1.length;i++)
		{
		  res+=s1[i]+" ";	
		}
		res=res.trim();
		System.out.print(res);
		
	}

}
