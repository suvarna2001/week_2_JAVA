
//. WAP to find factors of a given number 
import java.util.Scanner;

class Example12 {
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter number to find factors");
    int num=s.nextInt();
      for(int i=1;i<=num/2;i++){
      if(num%i==0){
        System.out.println(i);
      }
      }
  }
}