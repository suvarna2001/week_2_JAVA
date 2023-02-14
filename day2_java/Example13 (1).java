
//. WAP to find total number of factors of a given number 
import java.util.Scanner;

class Example13 {
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int count=0;
      System.out.println("Entrer number to find factors");
    int num=s.nextInt();
    for(int i=1;i<=num/2;i++){
      if(num%i==0){
        count++;
        
      }
    }System.out.println("number of factors:"+count);
  }
}