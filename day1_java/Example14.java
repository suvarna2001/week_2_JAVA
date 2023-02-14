import java.util.Scanner;

class Example14 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int year = 0;

        System.out.println("Enter Year  : ");
        year = s.nextInt();

        if (year % 4 == 0)
            System.out.println(year + "  It is Leap year");
        else
            System.out.println(year + " It is not a Leap year");
    }
}