package Task5_StudentManagementSystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentManagementSystem sms = new StudentManagementSystem();

        int choice;

        do {

            System.out.println("\n====== STUDENT MANAGEMENT SYSTEM ======");

            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Exit");

            System.out.print("Enter Choice : ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Roll Number : ");

                    int roll = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name : ");

                    String name = sc.nextLine();

                    System.out.print("Enter Grade : ");

                    String grade = sc.nextLine();

                    sms.addStudent(new Student(roll, name, grade));

                    break;

                case 2:

                    sms.displayStudents();

                    break;

                case 3:

                    System.out.print("Enter Roll Number : ");

                    roll = sc.nextInt();

                    sms.searchStudent(roll);

                    break;

                case 4:

                    System.out.print("Enter Roll Number : ");

                    roll = sc.nextInt();

                    sms.removeStudent(roll);

                    break;

                case 5:

                    System.out.println("Thank You!");

                    break;

                default:

                    System.out.println("Invalid Choice");

            }

        } while (choice != 5);

        sc.close();

    }

}