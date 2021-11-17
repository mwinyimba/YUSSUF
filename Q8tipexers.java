import java.util.Scanner;

public class Q8tipexers {
    public static void main(String[] args) {

        Scanner T = new Scanner(System.in);

        System.out.println("Please Enter the charge for the food");

        double charge = T.nextDouble();

        double tipP = 0.15;
        double tax = 0.7;

        double tip = tipP * charge;

        double salestax = tax * charge;
        double total = tip * tax;

        System.out.println(tip);
        System.out.println(tax);
        System.out.println(total);

    }
}