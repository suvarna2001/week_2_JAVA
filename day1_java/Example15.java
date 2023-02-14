import java.util.Scanner;

class Example15.java {
    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);

        float basicsalary = 0, da = 0, hra = 0, grosssalary = 0;

        System.out.println("Enter basicsalary : ");
        basicsalary = s.nextFloat();

        if (basicsalary <= 10000)
        {
            hra = (67 * basicsalary) / 100;
            da = (78 * basicsalary) / 100;
            grosssalary = basicsalary + hra + da;
        } 
        else if (basicsalary > 10000 && basicsalary < 20000)
        {
            hra = (70 * basicsalary) / 100;
            da = (80 * basicsalary) / 100;
            grosssalary = basicsalary + hra + da;
        } 
        else
        {
            hra = (73 * basicsalary) / 100;
            da = (87 * basicsalary) / 100;
            grosssalary = basicsalary + hra + da;
        }

        System.out.println("grosssalary  is : " + grossSalary);

    }
}