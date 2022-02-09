package main.schoolapp;

import java.util.Scanner;

public class SchoolApp {
  public static void main(String[] args) {
    // Ask how many new students we want to add
    System.out.print("Enter number of new students: ");
    Scanner in = new Scanner(System.in);
    int numOfStudents = in.nextInt();

    // Create n number of new students
    Student[] newStudents = new Student[numOfStudents];
    for (int i = 0; i < numOfStudents; i++) {
      System.out.println("\nStudent " + (i + 1));
      Student newStudent = new Student();
      newStudents[i] = newStudent;
      newStudent.enroll();
      newStudent.payFees();
    }

    // Display student information
    System.out.println("\nTotal new students created: " + newStudents.length);
    System.out.println("Please see new student information below:\n");
    for (int i = 0; i < newStudents.length; i++) {
      System.out.println("Student " + (i + 1) + "\n");
      System.out.println(newStudents[i] + "\n");
    }
    in.close();
  }
}
