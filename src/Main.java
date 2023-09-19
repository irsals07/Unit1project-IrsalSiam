import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        //Scanner class
        Scanner s = new Scanner(System.in);
        NumberFormat formatter = new DecimalFormat("#0.00");


        //Declaring variables
        int people;
        int tipAmount;
        double startBill;
        double totalBill;
        double totalTip;
        double tipPerPerson;
        double totalPerPerson;

        // Getting user input
        ///start bill
        System.out.print("Please enter your total bill: ");
        String bill = s.nextLine();
        startBill = Double.parseDouble(bill);

        ///tip amount
        System.out.print("Please enter the tip amount: ");
        String tip = s.nextLine();
        tipAmount = Integer.parseInt(tip);

        ///people
        System.out.print("Please enter the total amount of people: ");
        String totalPeople = s.nextLine();
        people = Integer.parseInt(totalPeople);

        //Calculations
        totalTip = ((double)tipAmount/100) * startBill;
        tipPerPerson = totalTip/people;
        totalBill = totalTip + startBill;
        totalPerPerson = totalBill/people;

        //Output
        System.out.println("The original bill is $" + formatter.format(startBill));
        System.out.println("The total tip is $" + formatter.format(totalTip));
        System.out.println("The total bill including the tip is $" + formatter.format(totalBill));
        System.out.println("The tip per person is $" + formatter.format(tipPerPerson));
        System.out.println("The total per person is $" + formatter.format(totalPerPerson));


    }
}