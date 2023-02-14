import java.util.Scanner;

class Example9{
    public static void main(String[] args) {
      
        Scanner s = new Scanner(System.in);

   
        int a = 0;
        System.out.println("Enter a : ");
        a = s.nextInt();

        if (a < 0)
            System.out.println(a + " is Negative");
        else
            System.out.println(a + " is Positive");
    }
}