package main.emailapp.v2;

// import java.util.Scanner;

public class Email {
  private String firstName;
  private String lastName;
  private String password;
  private int defaultPasswordLength = 8;
  private String department;
  public String email;
  private int mailboxCapacity = 50;
  private String alternateEmail;
  private String schoolSuffix = "enfieldgrammar.co.uk";

  // Contructor to receive first and last name
  public Email(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
    System.out.println("Creating new user: " + firstName + ' ' + lastName);

    // Call method asking for department
    // department = setDepartment();

    // // Call method to generate password
    // password = generatePassword(defaultPasswordLength);

    // // Create email address
    // if (department != "") {
    //   email = firstName.toLowerCase() + '.' + lastName.toLowerCase() + '@' + department.toLowerCase() + '.' + schoolSuffix;
    // } else {
      email = firstName.toLowerCase() + '.' + lastName.toLowerCase() + '@' + schoolSuffix;
    // }
  }

  // Ask for the department
  private String setDepartment(){
    // String dep1 = "SMT";
    // String dep2 = "Teaching";
    // String dep3 = "Admissions";
    // System.out.print("Select department:\n1 - " + dep1 + "\n2 - " + dep2 + "\n3 - " + dep3 + "\n0 - N\\A\n");
    // System.out.print("Department: ");
    // try (Scanner in = new Scanner(System.in)) {
    //   int depChoice = in.nextInt();
    //   if (depChoice == 1) { return dep1; }
    //   else if (depChoice == 2) { return dep2; }
    //   else if (depChoice == 3) { return dep3; }
    //   else { return ""; }
    // }
    return "";
  }

  // Generate random password
  private String generatePassword(int length) {
    String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@£$%^&*";
    char[] password = new char[length];
    for (int i = 0; i < length; i++) {
      int rand = (int) (Math.random() * passwordSet.length());
      password[i] = passwordSet.charAt(rand);
    }
    return new String(password);
  }

  // Set the mailbox capacity
  public void setMailboxCapacity(int mailboxCapacity) { this.mailboxCapacity = mailboxCapacity; }

  // Set the alternate email
  public void setAlternateEmail(String alternateEmail) { this.alternateEmail = alternateEmail; }

  // Change the password
  public void setPassword(String password) { this.password = password; }

  // Show mailbox capacity
  public int getMailboxCapacity() { return mailboxCapacity; }

  // Show alternate email
  public String getAlternateEmail() { return alternateEmail; }

  // Show password
  public String getPassword() { return password; }

  // Show email info
  public String getInfo() {
    return "DISPLAY NAME: " + firstName + ' ' + lastName +
            "\nEMAIL: " + email +
            "\nMAILBOX CAPACITY: " + mailboxCapacity + "gb";
  }
}
