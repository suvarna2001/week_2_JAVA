//WAP to print sum of evennumber and sum of odd numbers

import java.util.Scanner;
 class Example3
{
public static void main(String[] args) 
	{
		int min,max, i, evenSum = 0, oddSum = 0;
		Scanner s=new Scanner(System.in);
		
		System.out.print(" Enter minimum  Number : ");
		min = s.nextInt();	

    System.out.print(" Enter maximum  Number : ");
		max = s.nextInt();	
		
		for(i =min; i <= max; i++)
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
			System.out.println( + min +  "to" + max + "  =  " + evenSum);
		System.out.println( + min + "to" + max + "  =  "  + oddSum);
  }
  }