import java.util.*;

public class Solution {
  
  // Function to reverse a given string
  public static String FirstReverse(String str) {
    return new StringBuilder(str).reverse().toString();
  }
  
  // Main method where the program starts execution
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Prompt the user to enter a string
    System.out.print("Enter a string: ");
    
    // Read input from the user
    String input = s.nextLine();
    
    // Call the FirstReverse function and print the reversed string
    System.out.println("Reversed string: " + FirstReverse(input)); 
  }

}
