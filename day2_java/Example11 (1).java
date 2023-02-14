/*
  2*1=2
2*2=4
2*3=6
  */

import java.util.Scanner;
class Example11{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter number to print table");
    int num=s.nextInt();
    for(int i=1;i<=10;i++){
      System.out.println(num+"*"+i+"="+(num*i));
    }
  }
}