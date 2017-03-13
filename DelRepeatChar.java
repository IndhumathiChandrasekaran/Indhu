package Indhu;

import java.util.Scanner;

public class DelRepeatChar {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String str=s.next();
	StringBuffer buf=new StringBuffer(str);
	for(int i=0;i<=buf.length();i++)
	{
		for(int j=i+1;j<buf.length();j++)
		{
			if(buf.charAt(i)==buf.charAt(j))
			{
				buf.deleteCharAt(j);
				j--;
			}
		}
	}
	System.out.println(buf);
}
}
