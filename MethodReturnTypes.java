public class MethodReturnTypes {
    // Main method
    public static void main(String[] args) {
        // Call the displayWelcomeMessage method
        displayWelcomeMessage();
        
        // Declare variables
        int value1 = 20;
        int value2 = 30;
        
        // Call calculateAverage method and store result
        double result = calculateAverage(value1, value2);
        
        // Print the result
        System.out.println("The average is: " + result);
    }
    
    // Void method to display welcome message
    public static void displayWelcomeMessage() {
        System.out.println("Welcome to our program!");
    }
    
    // Method to calculate and return average
    public static double calculateAverage(int num1, int num2) {
        double average = (num1 + num2) / 2.0;
        return average;
    }
}
