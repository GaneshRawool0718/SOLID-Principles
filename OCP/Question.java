package OCP;

public class Question {
    // Open/Closed Principle (OCP) Example
    // Base class for questions that can be extended without modifying this class.
    public void question() {
        System.out.println("This is a question.");
    }
}

class CodingQuestion extends Question {
    // CodingQuestion class extends Question and provides specific implementation for a coding question.
    @Override
    public void question() {
        System.out.println("What is the time complexity of binary search?");
    }
}

class Client {
    // Client class to demonstrate the usage of Question and its subclasses
    public static void main(String[] args) {
        // Using Question and its subclass CodingQuestion
        Question question = new CodingQuestion();
        question.question(); // Outputs: What is the time complexity of binary search?
    
    }
}