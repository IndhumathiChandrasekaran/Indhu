package LogicBuilding;

import java.util.Scanner;

public class MinBet2Times {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int t1=0;
	int t2=0;
	int h1,m1,h2,m2;
	h1=s.nextInt();
	m1=s.nextInt();
	h2=s.nextInt();
	m2=s.nextInt();
    t1=h1*60;
    t1+=m1;
    t2=h2*60;
    t2+=m2;
    int t=Math.abs(t1-t2);
    System.out.println(t);
}
}
