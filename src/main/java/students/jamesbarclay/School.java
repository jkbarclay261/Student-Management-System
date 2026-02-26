package students.jamesbarclay;


import java.util.ArrayList;

public class School {
    private ArrayList<Student> studentList = new ArrayList<>();
    private ArrayList<Instructor> instructorList = new ArrayList<>();

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void addInstructor(Instructor instructor) {
        instructorList.add(instructor);
    }

    public void printAllPeople() {
        for (Student s : studentList) s.getSummary();
        for (Instructor i : instructorList) i.getSummary();
    }
}