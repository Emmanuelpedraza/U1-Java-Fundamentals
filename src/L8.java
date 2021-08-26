import java.sql.SQLOutput;
import java.util.Scanner;

public class L8 {

    public static void main(String[] args) {

        //Create a Scanner object to read input
        Scanner read = new Scanner(System.in);
//
        /*String name;
        int hours;
        double payRate;
        double grossPay;
        Get the user's name
        System.out.println("What is your name?");
       name = read.nextLine();

        Get the number of hours worked
        System.out.println("How many hours did you work?");
        hours = read.nextInt();

        Get the user's hourly rate
       System.out.println("What is your hourly pay rate?");
      payRate = read.nextDouble();

        Calculate the gross pay
        grossPay = hours * payRate;

        System.out.println("Hello " + name);
        System.out.println("Your gross pay is $" + grossPay);

        //Bugaboo #1 - Hanging Carriage
       /* int age;
        String name;

        System.out.println("how old are you");
        age = read.nextInt();

        read.nextLine();//Eats up the hanging

        System.out.println("What is your name?");
        name = read.nextLine();

        //System.out.println("What is your lastname ?");
       // String lastName = read.nextLine();

        System.out.println("Hello, " + name + " you are " + age + " years old!!!!!");



        */
        //Bugaboo # - token

        String firstName;
        String lastName;

        System.out.println("enter your full name");
        firstName = read.next();
        lastName = read.nextLine();

        System.out.println("Hello " + firstName + "" + lastName);

    }
}
