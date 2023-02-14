// WAP to print number of digits of a number

import java.util.Scanner;
  class Example6{
  public static void main (String[] args)
  {
    int num;
    int count=0;
    	Scanner s=new Scanner(System.in);
		
		System.out.print(" Enter  Number : ");
		num = s.nextInt();	
    while(num!=0){
      num=num/10;
        count++;
          }
  System.out.println(count);
  }
}