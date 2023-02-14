import java.util.Scanner;

class Example10 {
    public static void main(String[] args) {
      
        Scanner s = new Scanner(System.in);

      
        int a = 0;
        System.out.println("Enter a : ");
        a = s.nextInt();

        if (a == 0)
            System.out.println(a + " It is Zero");
        else if (a % 2 == 0)
            System.out.println(a + "It is Even");
        else
            System.out.println(a + "It is Odd");
    }
}