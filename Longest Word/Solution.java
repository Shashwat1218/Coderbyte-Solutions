public class Solution {

    // Function to find the longest word in a string
    public static String LongestWord(String sen) {
        // Split the string into words ignoring non-alphanumeric characters
        String[] words = sen.split("[^a-zA-Z0-9]+");
        
        // Initialize variable to store the longest word found
        String longest = "";
        
        // Iterate through each word to find the longest one
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        
        // Return the longest word found
        return longest;
    }
    
    // Main method where the program starts execution
    public static void main(String args[]) {
        // Example usage: find the longest word in "fun&!! time" and print it
        System.out.println(LongestWord("fun&!! time"));
    }
}
