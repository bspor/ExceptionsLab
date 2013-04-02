package lab1;

import javax.swing.JOptionPane;

/**
 * The purpose of this challenge is to give you practice time using
 * Java Exception handling techniques.
 * <p>
 * Your challenge is to consider all the possible things that can go wrong
 * with this program and use exception handling where appropriate to prevent
 * the program from crashing. In addition you must display a friendly error
 * message in a JOptionPane and ask the user to try again.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Challenge1 {
    //private static final int LAST_NAME_IDX = 1; got rid of this constant
    // as you dont know how many names a person may have.

    public static void main(String[] args) {
        Challenge1 app = new Challenge1();
        
        String fullName = JOptionPane.showInputDialog("Enter full name:");
        String lastName = app.extractLastName(fullName);
        String msg = "Your last name is: " + lastName;
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public String extractLastName(String fullName) {
        String[] nameParts = fullName.split(" ");
            //Create a local variable to determine the last index of tthe array
            int arraySize = nameParts.length-1;
        //Check for Null and 0 length input 
        if (fullName == null || fullName.length() == 0) {
            throw new IllegalArgumentException("Entry Required.");
        //Here I assume that if a comma is used, the user input Fname then LName
        } else if (fullName.contains(",")) {
             return nameParts[0];
        //Defaults to the last word in the String as the last name
        }else{
            return nameParts[arraySize];
        }
    }
}
