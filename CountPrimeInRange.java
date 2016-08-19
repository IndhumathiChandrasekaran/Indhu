package LogicBuilding;

import java.util.Scanner;

public class CountPrimeInRange {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int start=s.nextInt();
	int end=s.nextInt();
	int count=0;
	for(int i=start;i<end;i++)
	{
		int j;
		for(j=2;j<i;j++)
		{
			if(i%j==0)
			{
				break;
			}
		}
		if(i==j)
		{
			count++;
		}
	}
	System.out.println(count);
}
}
