package schoolapp;

import java.util.Scanner;

public class Student {
  private String firstName;
  private String lastName;
  private String classYear;
  private int classYearCode;
  private String studentID;
  private int balance = 0;
  private String[] enrolledCourses;
  private static int id = 1000;
  private static int costOfCourse = 600;
  private static String[] courses = {"Mathematics", "English", "Biology", "Chemistry", "Physics", "Computer Science"};

  // Constructor: prompt user to enter student's name and year
  public Student() {
    try (Scanner in = new Scanner(System.in)) {

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
    }
    setStudentID();
    System.out.println(firstName + " " + lastName + "\n" + classYear + "\n" + studentID);
  }

  // Generate student ID
  private void setStudentID() {
    id++;
    studentID = classYearCode + "" + id;
  }

  // Enroll in courses
  // do... while (courseCode != 0)
  // for loop courses i+1 to get courseCode
  // courseCounter for new Array[courseCounter]?
  // then iterate through courses to add to enrolled Courses
  // or use an arrayList probably better as it doesn't have a set length?

  // View balance

  // Pay tuition

  // Show status: name, ID, courses, balance
}
