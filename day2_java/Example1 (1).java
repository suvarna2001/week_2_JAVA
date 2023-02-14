//WAP to print sum of evennumber and sum of odd numbers

import java.util.Scanner;
 class Example1
{
public static void main(String[] args) 
	{
		int number, i, evenSum = 0, oddSum = 0;
		Scanner s=new Scanner(System.in);
		
		System.out.print(" Enter  Number : ");
		number = s.nextInt();	
		
		for(i = 1; i <= number; i++)
		{
			if(i % 2 == 0)
			{
				evenSum = evenSum + i; 
			}
			else
			{
				oddSum = oddSum + i;
			}
		}
			System.out.println( + number + "  =  " + evenSum);
		System.out.println( + number + " = " + oddSum);
  }
}