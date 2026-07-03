package Task5_StudentManagementSystem;

import java.util.ArrayList;

public class StudentManagementSystem {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student Added Successfully!");
    }

    public void displayStudents() {

        if (students.isEmpty()) {
            System.out.println("No Student Records Found.");
            return;
        }

        for (Student student : students) {

            System.out.println("-------------------");
            System.out.println(student);

        }

    }

    public void searchStudent(int rollNo) {

        for (Student student : students) {

            if (student.getRollNo() == rollNo) {

                System.out.println(student);
                return;

            }

        }

        System.out.println("Student Not Found.");

    }

    public void removeStudent(int rollNo) {

        for (Student student : students) {

            if (student.getRollNo() == rollNo) {

                students.remove(student);
                System.out.println("Student Removed.");
                return;

            }

        }

        System.out.println("Student Not Found.");

    }

}