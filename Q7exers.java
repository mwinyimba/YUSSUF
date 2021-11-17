import java.util.Scanner;

public class Q7exers {
    public static void main(String[] args) {
        Scanner G = new Scanner(System.in);
        System.out.println("Please Enter the of miles driven");

        double milesdriven = G.nextDouble();

        System.out.println("Enter the of the gallon of gas");

        double gallongas = G.nextDouble();

        double MGP = milesdriven / gallongas;

        System.out.println("The MGP is" + MGP);

    }

}