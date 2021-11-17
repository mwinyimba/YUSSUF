import java.util.Scanner;
public class Q12exers{
 public static void main(String[] args) {
        
  Scanner R= new Scanner (System.in);
  
  System.out.println("Please Enter the first number");
  double Number1= R.nextDouble();

  System.out.println("Please Enter the second number");

  double Number2=R.nextDouble();
    double sum=Number1+Number2;
    double product=Number1*Number2;
    double diff=Number1-Number2;
    double qout=Number1/Number2;
  
  System.out.println("The sumattion of two number is"+sum);
  System.out.println("The product of two number  is"+product);
  System.out.println("The substraction of two number is"+diff);
  System.out.println("The quotient of two number is"+qout);
