import java.util.Scanner;

public class Q6saletaxexers {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Please Enter the amount of purchase");
        double purchase;
        purchase = S.nextDouble();

        double countytax = 0.02;
        double statetax = 0.04;
        double ctax = purchase * countytax;
        double stax = purchase * statetax;

        System.out.println("The ctax is" + ctax);
        System.out.println("The stax is" + stax);

    }

}