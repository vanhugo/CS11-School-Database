public class Teacher {
    // Fields representing the teacher's first name, last name, and the subject they teach
    private String firstName;
    private String lastName;
    private String subject;

    // Constructor to initialize the teacher's first name, last name, and subject
    public Teacher(String firstName, String lastName, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    // Getter for the teacher's first name
    public String getFirstName() {
        return firstName;
    }

    // Setter for the teacher's first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter for the teacher's last name
    public String getLastName() {
        return lastName;
    }

    // Setter for the teacher's last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter for the subject the teacher teaches
    public String getSubject() {
        return subject;
    }

    // Setter for the subject the teacher teaches
    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Overridden toString method to provide a string representation of the teacher
    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName +
                " Subject: " + subject;
    }
}
