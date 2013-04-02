package lab3;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui {
    private NameService nameService;

    public InputOutputGui() {
        nameService = new NameService();
    }

    public void startConversation() {
        
        String fullName = JOptionPane.showInputDialog("Enter full name:");
        String lastName = "";
        String msg = "";
        try {
            lastName = nameService.extractLastName(fullName);
            msg = "Your last name is: " + lastName;
        } catch (InvalidNameException ex) {
            msg = ex.getMessage();
        }
        //String msg = "Your last name is: " + lastName;
        JOptionPane.showMessageDialog(null, msg);
        
    }
     
}
