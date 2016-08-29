package LogicBuilding;

import java.util.Scanner;

public class TargetSum {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int[] arr=new int[4];
	System.out.println("Enter the number ");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=s.nextInt();
	}
	System.out.println("Target ");
	int t=s.nextInt();
	int sum=0;
	int num1=0;int num2=0;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr.length;j++)
		{
			sum=(arr[i]+arr[j]);
			if(sum==t)
			{
				num1=arr[i];
				num2=arr[j];
				break;
			}
		}
	}
	System.out.println("The sum of "+num1+ " , " +num2+ " & the target "+t);
}
}
