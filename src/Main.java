public class Main {
    public static void main(String[] args) {
        // Create a new School object with name, address, and establishment year
        School school = new School("Greenwood High", "123 Elm Street", 1995);

        // Create Teacher objects
        // Initialize with first name, last name, and subject
        Teacher teacher1 = new Teacher("John", "Doe", "Mathematics");
        Teacher teacher2 = new Teacher("Jane", "Smith", "English");
        Teacher teacher3 = new Teacher("Emily", "Johnson", "History");

        // Add teachers to the school's list of teachers
        school.addTeacher(teacher1);
        school.addTeacher(teacher2);
        school.addTeacher(teacher3);

        // Create Student objects
        // Initialize with first name, last name, and grade
        Student student1 = new Student("Alice", "Johnson", "10th Grade");
        Student student2 = new Student("Bob", "Williams", "11th Grade");
        Student student3 = new Student("Charlie", "Brown", "10th Grade");
        Student student4 = new Student("Daisy", "Miller", "9th Grade");
        Student student5 = new Student("Eve", "Davis", "11th Grade");
        Student student6 = new Student("Frank", "Wilson", "12th Grade");
        Student student7 = new Student("Grace", "Moore", "10th Grade");
        Student student8 = new Student("Hank", "Taylor", "9th Grade");
        Student student9 = new Student("Ivy", "Anderson", "12th Grade");
        Student student10 = new Student("Jack", "Thomas", "11th Grade");

        // Add students to the school's list of students
        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);
        school.addStudent(student4);
        school.addStudent(student5);
        school.addStudent(student6);
        school.addStudent(student7);
        school.addStudent(student8);
        school.addStudent(student9);
        school.addStudent(student10);

        // Display the current list of teachers
        System.out.println("Teachers:");
        school.showAllTeachers();

        // Display the current list of students
        System.out.println("\nStudents:");
        school.showAllStudents();

        // Remove specified students from the school's list
        school.deleteStudent(student4); // Removing Daisy Miller
        school.deleteStudent(student7); // Removing Grace Moore

        // Remove a specified teacher from the school's list
        school.deleteTeacher(teacher2); // Removing Jane Smith

        // Display the updated list of teachers after removal
        System.out.println("\nUpdated Teachers:");
        school.showAllTeachers();

        // Display the updated list of students after removal
        System.out.println("\nUpdated Students:");
        school.showAllStudents();
    }
}
