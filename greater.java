/*
accept two numbers and check whether first number is greater or
second number is greater or they are equal.
*/


import java.util.*;
public class Equal
{
	public static void main(String args[])
	{
		System.out.println("enter a number no1,no2");
		Scanner sc=new Scanner(System.in);
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		if(no1 > no2)
		{
			System.out.println("first number is greater");
		}
		else if(no1 < no2)
		{
			System.out.println("second number is greater");
		}
		else
		{
			System.out.println("both number are equal");
		}
	}