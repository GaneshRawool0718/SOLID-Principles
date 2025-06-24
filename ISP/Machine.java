package ISP;
// Interface Segregation Principle (ISP) Example
// Classes should not be forced to implement interfaces they do not use.

interface Printer{
    // Method to print documents
    void print();
}

interface Scanner {
    // Method to scan documents
    void scan();
}

public class Machine implements Printer {
    // The Machine class implements the Printer interface
    public void print() {
        System.out.println("Printing from Machine");
    }
}
