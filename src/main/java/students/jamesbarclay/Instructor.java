package students.jamesbarclay;

import java.util.ArrayList;

public class Instructor extends Person {
    private String department;
    private ArrayList<Student> assignedStudents = new ArrayList<>();

    public Instructor(int id, String firstName, String lastName, String email, String department) {
        super(id, firstName, lastName, email);
        this.department = department;
    }

    // Assign a student to the instructor
    public void addStudent(Student student) {
        assignedStudents.add(student);
    }

    //  all students assigned to this instructor
    public void printRoster() {
        System.out.println(getFirstName() + "'s Roster:");
        for (Student s : assignedStudents) {
            System.out.println("  - " + s.getFirstName() + " " + s.getLastName() +  " | Grade Level: " + s.getGradeLevel() +  " | GPA: " + s.getGpa());
        }
    }

    public void createAnnouncement(String message) {
        System.out.println("[Announcement] " + message);
    }

    @Override
    public void getSummary() {
        System.out.println("[Instructor] " + getFirstName() + " " + getLastName() +  " | Department: " + department);
    }
}
