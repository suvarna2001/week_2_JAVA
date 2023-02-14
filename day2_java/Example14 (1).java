
//WAP to find number is prime number or not
import java.util.Scanner;

class Example14 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int count = 0;
    System.out.println("Enter number to check it is prime number or not");
    int num = s.nextInt();
    for (int i = 1; i <= num / 2; i++) {
      if (num % i == 0) {
        count++;
      }
    }
    if (count == 1) {
      System.out.println("prime number");
    } else {
      System.out.println("not a prime number");
    }
  }
}
