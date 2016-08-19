package LogicBuilding;

import java.util.Scanner;

public class WorkingDay {
	public boolean workingDay(String day)
	{
		String str="sunday";
		if(day.equalsIgnoreCase(str))
		{
			return false;
		}
		else
		{
			return true;
		}
	}
public static void main(String[] args) {
	WorkingDay w=new WorkingDay();
	Scanner s=new Scanner(System.in);
	String st=s.next();
	System.out.println(st+" is "+w.workingDay(st));
}
}
