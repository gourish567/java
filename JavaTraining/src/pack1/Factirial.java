package pack1;

import java.util.Scanner;

public class Factirial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		Scanner s=new Scanner(System.in);
		int a,res=1;
		a=s.nextInt();
		Factirial obj=new Factirial();
		System.out.println("Factorial of number is :"+(obj.fact(a)));
		

	}
	public int fact(int n)
	{
		int res=1;
		while(n>0)
		{
			res*=n;
			n--;
		}
		return res;
	}

}
