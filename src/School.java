import java.util.ArrayList;

public class School {
    // List of teachers in the school
    private ArrayList<Teacher> teachers = new ArrayList<>();

    // List of students in the school
    private ArrayList<Student> students = new ArrayList<>();

    // Additional fields representing the school's name, address, and the year it was established
    private String name;
    private String address;
    private int establishmentYear;

    // Constructor to initialize the School object with name, address, and establishment year
    public School(String name, String address, int establishmentYear) {
        this.name = name;
        this.address = address;
        this.establishmentYear = establishmentYear;
    }

    // Getter for the school's name
    public String getName() {
        return name;
    }

    // Setter for the school's name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for the school's address
    public String getAddress() {
        return address;
    }

    // Setter for the school's address
    public void setAddress(String address) {
        this.address = address;
    }

    // Getter for the year the school was established
    public int getEstablishmentYear() {
        return establishmentYear;
    }

    // Setter for the year the school was established
    public void setEstablishmentYear(int establishmentYear) {
        this.establishmentYear = establishmentYear;
    }

    // Add a teacher to the school's list of teachers
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    // Add a student to the school's list of students
    public void addStudent(Student student) {
        students.add(student);
    }

    // Remove a teacher from the school's list of teachers
    public void deleteTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }

    // Remove a student from the school's list of students
    public void deleteStudent(Student student) {
        students.remove(student);
    }

    // Display all teachers in the school by printing each teacher's information
    public void showAllTeachers() {
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

    // Display all students in the school by printing each student's information
    public void showAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
