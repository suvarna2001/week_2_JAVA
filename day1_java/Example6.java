import java.util.Scanner;
class Example6{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
  
  int basicsalary=0, hra=0, da=0;
  int grosssalary;
  
  System.out.println("Enter the basicsalary");
  basicsalary=s.nextInt();
  System.out.println("Enter the hra");
  System.out.println("Enter the da");
    hra=(89*basicsalary)/100;
    da=(90* basicsalary)/100;
      grosssalary=basicsalary+hra+da;
  
  System.out.println("hra is :"+hra);
    System.out.println("da is :"+da);
    System.out.println("gross salary is :" +grosssalary);
  
  }
}