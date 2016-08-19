package LogicBuilding;

import java.util.Scanner;

public class SwapEvenAndOddChar {

	public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    String str=s.next();
    StringBuffer buf=new StringBuffer(str);
    String st="";
    char c=str.charAt(0);int j=0;
    for(int i=1;i<str.length();i+=2)
    {
    	if(i<str.length()-1){
    		buf.setCharAt(i,str.charAt(j));
    		
    	    buf.setCharAt(j,str.charAt(i));
    	    
        j+=2;
	}}
    System.out.println(buf);
	}
}
