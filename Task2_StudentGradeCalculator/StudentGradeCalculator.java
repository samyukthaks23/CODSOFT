package Task2_StudentGradeCalculator;

import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("   STUDENT GRADE CALCULATOR");
        System.out.println("=================================");

        System.out.print("Enter Number of Subjects: ");
        int subjects = sc.nextInt();

        int total = 0;

        for (int i = 1; i <= subjects; i++) {

            System.out.print("Enter marks for Subject " + i + " (0-100): ");
            int marks = sc.nextInt();

            while (marks < 0 || marks > 100) {
                System.out.print("Invalid Marks! Enter again: ");
                marks = sc.nextInt();
            }

            total += marks;
        }

        double average = (double) total / subjects;

        String grade;

        if (average >= 90)
            grade = "A+";
        else if (average >= 80)
            grade = "A";
        else if (average >= 70)
            grade = "B";
        else if (average >= 60)
            grade = "C";
        else if (average >= 50)
            grade = "D";
        else
            grade = "F";

        System.out.println("\n========== RESULT ==========");
        System.out.println("Total Marks : " + total);
        System.out.println("Average     : " + average + "%");
        System.out.println("Grade       : " + grade);

        sc.close();
    }
}