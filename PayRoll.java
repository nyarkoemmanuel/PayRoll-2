import java.util.Scanner;


public class PayRoll {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);


        System.out.println();
        System.out.print("What is your name?  ");
        String Name = in.nextLine();


        System.out.println();
        System.out.print("How many hours did you work this week?  ");
        int hours = sc.nextInt();


        System.out.println();
        System.out.print(" what is your hourly Pay Rate?  ");
        Double payRate = sc.nextDouble();


        System.out.println();
        System.out.print(" Hello," + Name);

        Double grossPay = hours * payRate;

        System.out.println();
        System.out.println();
        System.out.println("Your gross pay is $" + grossPay);


    }
}