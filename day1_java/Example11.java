import java.util.Scanner;

class Example11 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        int age;

        System.out.println("Enter Age : ");
        age = s.nextInt();

        if (age > 18)
            System.out.println("Eligible to vote");
        else
            System.out.println("Not Eligible to vote");
    }
}