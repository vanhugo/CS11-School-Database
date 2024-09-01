import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Student {
    // Fields representing the student's first name, last name, grade, and a unique 7-digit student number
    private String firstName;
    private String lastName;
    private String grade;
    private String studentNumber; // 7-digit student number

    // A static set to keep track of all used student numbers to ensure uniqueness
    private static Set<String> usedNumbers = new HashSet<>();

    // A static Random object used to generate random numbers
    private static Random random = new Random();

    //
    // Constructor to initialize the student's first name, last name, and grade
    // Also generates a unique student number for the student
    //
    public Student(String firstName, String lastName, String grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.studentNumber = generateUniqueStudentNumber();
    }

    // Method to generate a unique 7-digit student number
    private String generateUniqueStudentNumber() {
        String number;
        do {
            // Generate a random 7-digit number
            number = String.format("%07d", random.nextInt(10000000));
        } while (usedNumbers.contains(number)); // Ensure the number hasn't been used before
        usedNumbers.add(number); // Add the new number to the set of used numbers
        return number;
    }

    // Getter for the student's first name
    public String getFirstName() {
        return firstName;
    }

    // Setter for the student's first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter for the student's last name
    public String getLastName() {
        return lastName;
    }

    // Setter for the student's last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter for the student's grade
    public String getGrade() {
        return grade;
    }

    // Setter for the student's grade
    public void setGrade(String grade) {
        this.grade = grade;
    }

    // Getter for the student's unique student number
    public String getStudentNumber() {
        return studentNumber;
    }

    // Overridden toString method to provide a string representation of the student
    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName +
                " Grade: " + grade +
                " Student Number: " + studentNumber;
    }
}
