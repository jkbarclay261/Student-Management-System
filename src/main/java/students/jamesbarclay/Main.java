package students.jamesbarclay;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student(1, "Jordan", "Michael", "jordan@gmail.com", '2', 2.3);
        Student student2 = new Student(1, "Marcus", "Ross", "marcus@gmail.com", '1', 3.9);

        // Create instructor and assign students
        Instructor instructor1 = new Instructor(100, "Dr.", "Rivera", "rivera@gmail.com", "Computer Science");
        instructor1.addStudent(student1);
        instructor1.addStudent(student2);


        ArrayList<Person> people = new ArrayList<>();
        people.add(student1);
        people.add(student2);
        people.add(instructor1);


        System.out.println("--- People Summaries ---");
        for (Person p : people) {
            p.getSummary();
        }

        // Print roster
        System.out.println("\n--- Instructor Rosters ---");
        instructor1.printRoster();
    }
}