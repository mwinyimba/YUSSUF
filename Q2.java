import java.util.scanner;

class Q2 {
    public static void main(String [] args){
    System input = new scanner(System.in)
    System.out.print("enter the name " );
    String name = input.nextline();
    System.out.print("enter city" );
    String city = input.nextline();
    System.out.print("enter the college " );
    String college = input.nextline();
    System.out.print("enter the profession " );
    String profession = input.nextline();
    System.out.print("enter the petsname " );
    String petsname = input.nextline();
    System.out.print("please enter age");
    int age = input.nextInt();
    System.out.print("there once was a person named" + name"who lived in" + city "at the age of "+ age);
    }
}