package LogicBuilding;

import java.util.Scanner;

public class IsomericString {
public static void main(String[] args) {
	IsomericString i=new IsomericString();
	boolean bool=i.iso();
}
public boolean iso()
{
	Scanner s=new Scanner(System.in);
	String str1=s.next();
	String str2=s.next();
    int[] pos=new int[2];
    int count=0;
    if(str1.length()==str2.length())
    {
	for(int i=0;i<str1.length();i++)
	{
			for(int j=i+1;j<str2.length();j++)
			{
				if(str1.charAt(i)==str1.charAt(j))
				{
					pos[0]=i;
					pos[1]=j;
					count=1;
				}
			}
	}       if(count==1)
	        {
			if(str2.charAt(pos[0])==str2.charAt(pos[1]))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
   }
   else
   {
   	return false;
   }
}
}
