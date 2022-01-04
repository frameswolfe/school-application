package schoolapp;

public class SchoolApp {
  public static void main(String[] args) {
    Student stu1 = new Student();
    stu1.enroll();
    stu1.payFees();
    System.out.println(stu1);
    // Ask how many new users we want to add
    // Create n number of new students
  }
}
