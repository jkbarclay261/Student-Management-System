package students.jamesbarclay;

public class Student extends Person {
    private int gradeLevel;
    private double gpa;

    public Student(int id, String firstName, String lastName, String email, int gradeLevel, double gpa) {
        super(id, firstName, lastName, email);
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
    }

    // Determines if the student is on honor roll
    public boolean isOnHonorRoll() {
        return gpa >= 3.0;
    }

    // Summary override demonstrates polymorphism
    @Override
    public void getSummary() {
        System.out.println("[Student] " + getFirstName() + " " + getLastName() +
                " | Grade Level: " + gradeLevel +
                " | GPA: " + gpa +
                " | Honor Roll: " + (isOnHonorRoll() ? "Yes" : "No"));
    }

    // Getters
    public int getGradeLevel() {
        return gradeLevel;
    }

    public double getGpa() {
        return gpa;
    }
}