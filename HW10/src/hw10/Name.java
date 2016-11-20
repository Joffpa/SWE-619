
package hw10;

import java.util.HashSet;
import java.util.Set;
/**
 * Name holds first and last name. All values allowed, including null. 
 *  No methods are provided to get or set first or last name after construction.
 *  However class does not implement defensive copies on construction, client has access
 *  to references of instance variables that were passed in at construction.
 * 
 * @author Joffrey Pannee
 */
public class Name {
    //OVERVIEW: Hold firstname and lastname
    
    //Rep Invariant : All values allowed for first and last
    
    //Abstract function AF(c) = { c } 

    private final String first, last; //instance members to hold first and last name

    //Constructors
    /**
     *  Initialize this with a first and last name
     * @param first The first name 
     * @param last The last name
     */
    public Name(String first, String last) {
        //Effects: initalizes this.first and this.last
        this.first = first;
        this.last = last;
    }    
    
    /**
     *  Returns this in string form
     * @return first and last name concatenated
     */
    @Override
    public String toString(){
        //Effects: returns this.first and this.last concatenated
        return first + " " + last;
    }
    
    /**
     * Check for equality between this and another object
     * @param o the object to compare against
     * @return returns true if o is an instance of name with same values for first and last as this, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        //Effects: returns true if o is an instance of name with same values for first and last as this, false otherwise
        if (!(o instanceof Name)) {
            return false;
        }
        Name n = (Name) o;
        return n.first.equals(first) && n.last.equals(last);
    }
    
    /**
     * Returns the hash code for this. Separate instances with the same values for first and last will return the same hash code.
     * @return integer hash code for this
     */
    @Override
    public int hashCode() {
        //Effects: returns the hashcode for this, taking into account firat and last
        String firstVal = "";
        String lastVal = "";
        if(first != null){
            firstVal = first;
        }
        if(last != null){
            lastVal = last;
        }
        return 37 * firstVal.hashCode() * lastVal.hashCode();
    }
    
    /**
     * Checks if the rep invariant is upheld in the current state. All values for first and last are permitted, so always returns true.
     * @return 
     */
    public boolean repOk(){
        //Effects: verifies rep invariant. All values for first and last are valid so always returns true
        return true;
    }
       
    public static void main(String[] args) {
        Set s = new HashSet();
        s.add(new Name("Mickey", "Mouse"));
        System.out.println(s.contains(new Name("Mickey", "Mouse")));
    }

}
