import java.util.Scanner;
class Example7{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
  
  int sub1=0, sub2=0, sub3=0;
  int total=0,avg=0;
  
  System.out.println("Enter the marks of sub1,sub2,sub3");
  sub1=s.nextInt();
      sub2=s.nextInt();
      sub3=s.nextInt();

    total=sub1+sub2+sub3;
    avg=total/3;
    
  System.out.println("total marks is :"+total);
    System.out.println("Avg marks is :"+avg);
  
  
  }
}