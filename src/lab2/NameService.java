package lab2;

/**
 * This class provides various services relating to name manipulation.
 * No output should be performed here.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class NameService {
//    private static final int FIRST_NAME_IDX = 0;
//    private static final int LAST_NAME_IDX = 1;
    
    /**
     * Finds and returns the last name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     */
    public String extractLastName(String fullName) {
        String[] nameParts = fullName.split(" ");
         //Create a local variable to determine the last index of tthe array
           int arraySize = nameParts.length-1;
        //Check for Null and 0 length input 
        if (fullName == null || fullName.length() == 0) {
            System.out.println("how");
            throw new IllegalArgumentException("Entry Required.");
        //Here I assume that if a comma is used, the user input Fname then LName
        } else if (fullName.contains(",")) {
            System.out.println("huh");
             return nameParts[0];
        //Defaults to the last word in the String as the last name
        }else{
            System.out.println("whatinthe");
            System.out.println(arraySize);
            return nameParts[arraySize];
        }
    }
    
    /**
     * Finds and returns the first name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the first name
     */
    public String extractFirstName(String fullName) {
       return "Silly";
    }

    /**
     * Gets the length of a name.
     * 
     * @param name - any full name or part of a name.
     * @return the length of the name or part.
     */
    public int getNameLength(String name) {
        return name.length();
    }
}
