import java.util.Scanner;

class Example13 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        float units;
        float Bill;

        System.out.println("Enter unit : ");
        units = s.nextInt();

        if (units <= 50) 
        {
            Bill = units*0.50f;
        } 
        else if (units > 50 && units <= 150) 
        {
            Bill = units*1.23f;

        }
        else if (units > 150 && units <= 250) 
        {
            Bill = units*1.90f;
        } 
        else 
        {
            Bill = units*2.34f;
        }

        System.out.println("Bill is : " +Bill);
    }
}