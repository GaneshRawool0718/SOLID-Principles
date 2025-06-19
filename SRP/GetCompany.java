package SRP;

public class GetCompany {
    // Single Responsibility Principle (SRP) Example
    // Class with single responsibility: Company Information
    public static String getCompanyName() {
        // Method to return the company name
        return "NonStop io technology.";
    }
}

class Client {
    // It retrieves and displays the company name
    public static void main(String[] args) {
        // Using GetCompany to get the company name
        String companyName = GetCompany.getCompanyName();
        System.out.println("Company Name: " + companyName);
    }
}