import java.util.Scanner;

class Example8{
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        
        int day;
        System.out.println("Enter day : ");
        day = s.nextInt();

        if (day < 1 && day > 7){
         System.out.println("Invalid");
        }
        else if (day == 1)
            System.out.println("It is Sunday");
        else if (day == 2)
            System.out.println("It is Monday");
        else if (day == 3)
            System.out.println("It is Tuesday");
        else if (day == 4)
            System.out.println("It is Wednesday");
        else if (day == 5)
            System.out.println("It is Thursday");
        else if (day == 6)
            System.out.println("It is Friday");
        else
            System.out.println("It is Saturday");}
}