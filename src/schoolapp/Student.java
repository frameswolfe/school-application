package schoolapp;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
  private String firstName;
  private String lastName;
  private String classYear;
  private int classYearCode;
  private String studentID;
  private int balance = 0;
  private ArrayList<String> enrolledCourses = new ArrayList<String>();
  private static int id = 1000;
  private static int costOfCourse = 600;
  private static String[] courses = {"Mathematics", "English", "Biology", "Chemistry", "Physics", "Computer Science"};

  // Constructor: prompt user to enter student's name and year
  public Student() {
      Scanner in = new Scanner(System.in);

      System.out.print("First name: ");
      this.firstName = in.nextLine();
      System.out.print("Last name: ");
      this.lastName = in.nextLine();
      String year1 = "Freshman";
      String year2 = "Sophomore";
      String year3 = "Junior";
      String year4 = "Senior";
      System.out.print("Select class year:\n1 - " + year1 + "\n2 - " + year2 + "\n3 - " + year3 + "\n4 - " + year4 + "\n");
      System.out.print("Class year: ");
      classYearCode = in.nextInt();
      if (classYearCode == 1) {
        classYear = year1;
      } else if (classYearCode == 2) {
        classYear = year2;
      } else if (classYearCode == 3) {
        classYear = year3;
      } else {
        classYear = year4;
      }
    setStudentID();
  }

  // Generate student ID
  private void setStudentID() {
    id++;
    studentID = classYearCode + "" + id;
  }

  // Enroll in courses
  public void enroll() {
    int courseCode = 0;
    Scanner in = new Scanner(System.in);

    do {
      System.out.println("Select courses to enroll in:");
      for (int i = 0; i < courses.length; i++) {
        System.out.println(i + 1 + " - " + courses[i]);
      }
      System.out.println("0 - Exit");
      System.out.print("Course code (1-" + courses.length + "): ");
      courseCode = in.nextInt();

      if (courseCode != 0) {
        if (courseCode <= courses.length) {
          // Check if already enrolled in selected course
          boolean alreadyEnrolled = false;
          if (enrolledCourses.size() > 0) {
            for (int i = 0; i < enrolledCourses.size(); i++) {
              if (enrolledCourses.get(i).equals(courses[courseCode - 1])) {
                alreadyEnrolled = true;
              }
            }
          }
          if (alreadyEnrolled) {
            System.out.println("You have already enrolled in " + courses[courseCode - 1]);
          } else {
            enrolledCourses.add(courses[courseCode - 1]);
            balance += costOfCourse;
            System.out.println("You have enrolled in " + courses[courseCode - 1] + " for an added cost of £" + costOfCourse);
            System.out.println("Enrolled courses: " + enrolledCourses);
            showBalance();
          }
        } else { System.out.println("Invalid course code - please try again"); }
      }
    }
    while (courseCode != 0);
  }

  // View balance
  public void showBalance() {
    System.out.println("Outstanding balance: £" + balance);
  }

  // Pay tuition
  public void payFees() {
    Scanner in = new Scanner(System.in);
    showBalance();
    System.out.println("How much would you like to pay?");
    System.out.print("Enter amount: £");
    int payment = in.nextInt();
    balance -= payment;
    System.out.println("Thank you for your payment of £" + payment);
    showBalance();
  }

  // Show status: name, ID, courses, balance
  public String toString() {
    // System.out.println(
      return
      "DISPLAY NAME: " + firstName + ' ' + lastName +
      "\nCLASS YEAR: " + classYear +
      "\nSTUDENT ID: " + studentID +
      "\nENROLLED COURSES: " + enrolledCourses +
      "\nBALANCE: £" + balance
    ;
  }
}
