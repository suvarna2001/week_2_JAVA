
// WAP to print reverse of a given number.

import java.util.Scanner;

class Example18 {

  public static void main(String args[]) {
Scanner s = new Scanner(System.in);
    System.out.println("Enter number to print reverse order");
 int num=s.nextInt();
    int rev=0;
while(num!=0){
rev=rev*10+(num%10);
           num=num/10;
}
 System.out.println("Reverse number: "+rev); 
  }
}