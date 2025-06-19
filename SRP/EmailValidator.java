package SRP;

import java.util.Scanner;

class EmailValidator {
    // Single Responsibility Principle (SRP) Example
    // Class with single responsibility: Validation
    public static boolean isValidEmail(String email) {
        // Check if the email contains "@" and ends with ".com"
        if (email == null || email.isEmpty()) {
            return false;
        }
        return email.contains("@") && email.endsWith(".com");
    }
}

class UserRegistration {
    // Class with single responsibility: User Registration
    // It uses EmailValidator to validate email addresses.
    public static void registerUser(String email) {
        // Validate email using EmailValidator
        // If valid, proceed with registration logic
        if (EmailValidator.isValidEmail(email)) {
            System.out.println("User registered!");
        } else {
            System.out.println("Invalid email.");
        }
    }
}

class Client {
// Client class to demonstrate the usage of UserRegistration

    public static void main(String[] args) {
        // Client code to register a user
        // It prompts the user for an email and registers them.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your email: "); 
        String email = scanner.nextLine();
        UserRegistration.registerUser(email);
        scanner.close();
    }
}