//WAP to print sum of evennumber and sum of odd numbers

import java.util.Scanner;

public class Example2 {
	
	public static void main(String[] args) 
	{
		int number, i, evenSum = 0, oddSum = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.print(" Please Enter Number : ");
		number = s.nextInt();	
		
		i = 1;
		
		while(i <= number)
		{
			if(i % 2 == 0)
			{
				evenSum = evenSum + i; 
			}
			else
			{
				oddSum = oddSum + i;
			}
			i++;
		}
		System.out.println( + number + "  =  " + evenSum);
		System.out.println( + number + " = " + oddSum);
  }
}