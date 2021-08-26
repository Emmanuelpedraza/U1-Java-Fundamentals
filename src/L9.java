import javax.swing.JOptionPane;


public class L9{

    public static void main(String[] args) {

        String firstName;
        String lastName;

        firstName= JOptionPane.showInputDialog("what is your first name?");
        lastName = JOptionPane.showInputDialog("what is your last name?");


        JOptionPane.showMessageDialog(null, "hello " + firstName + "  " + lastName + " !!!!!!!!");


        //all input is received as string

        //pro tip: variable of the same data-type can be separated with a comma in the declaration

        int mph, minutes;
        double distance, hours;

        mph = Integer.parseInt(JOptionPane.showInputDialog("How fast were you driving ?"));
        minutes = Integer.parseInt(JOptionPane.showInputDialog("How long, in minutes were you traveling?"));


        hours = minutes/60.0;

        distance = mph * hours;

        JOptionPane.showInputDialog(null, "You traveled " + distance + " miles.");
        System.exit(0);
    }

}
