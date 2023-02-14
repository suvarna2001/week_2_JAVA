// WAP to print palindrome of a given number.

import java.util.Scanner;
class Example8 {
 public static void main(String args[]) {
 Scanner s = new Scanner(System.in);
    System.out.println("Enter number to check it is palindrome or not");
 int num=s.nextInt();
int rev=0;
 while(num!=0){
 rev=rev*10+(num%10);
 num=num/10;
}
 if(num==rev){
 System.out.println("it is palindrome");
 }
    else{
       System.out.println("it is not palindrome");
       }
 }
}