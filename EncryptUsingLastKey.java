package LogicBuilding;

import java.util.Scanner;

public class EncryptUsingLastKey {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String str=s.next();
	int ascii=0;
	String st="";
	for(int i=0;i<str.length()-1;i++)
	{
		ascii=str.charAt(str.length()-1);
		int  as=str.charAt(i);
		int diff=as-ascii;
		if(diff<=0)
		{
			diff+=26;
		}
		st+=(char)(diff+96);
	}
	st+=str.charAt(str.length()-1);
	System.out.println(st);
	
}
}
