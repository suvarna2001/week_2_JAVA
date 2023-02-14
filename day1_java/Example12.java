import java.util.Scanner;

class Example12{
    public static void main(String[] args) {
  
     Scanner s = new Scanner(System.in);
     int totalamount = 0, FiveHundrednote = 0, twoHundrednote = 0, Hundrednote = 0;

     
        System.out.println("Enter totalamount : ");
        totalamount = s.nextInt();

        if (totalamount % 100 != 0 && totalamount <= 0) 
        {
            System.out.println("Amount cannot be withdrawn");
        } 
        else
        {
            if (totalamount >= 500) 
            {
                FiveHundrednote = totalamount / 500;
                totalamount = totalamount % 500;
            }
            else if (totalamount >= 200 && totalamount < 500) 
            {
                twoHundrednote = totalamount / 200;
                totalamount = totalamount % 200;
            } 
            else
            {
                Hundrednote = totalamount / 100;
                totalamount = totalamount % 100;
            }
            System.out.println("Total number of notes is ");
            System.out.println("FiveHundrednote: " + FiveHundrednote);
            System.out.println("twoHundrednote: " + twoHundrednote);
            System.out.println("Hundrednote: " + Hundrednote);
        }
    }
}