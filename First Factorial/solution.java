public class solution {
    public static int factorial(int num) {
        int fact = 1; // Initialize the factorial result to 1
        
        // Iterate from the given number down to 1
        for (int n = num; n > 0; n--) {
            fact *= n; // Multiply the current value of fact by the current number n
        }
        
        return fact; // Return the computed factorial
    }
    
    public static void main(String args[]) {
        // Example usage and testing
        System.out.println(factorial(8)); // Output: 40320
    }
}
