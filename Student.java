import java.util.Scanner;
import java.lang.Integer;
import java.util.ArrayList;

public class Student {
  private String firstName;
  private String lastName;
  private int classLevel;
  private String studentId;
  private ArrayList<String> courses;
  private int tuitionBalance = 0;
  private static int costOfClass = 500;
  private static int id = 1000;
  private static Scanner input = new Scanner(System.in);
  // Constructor: promt for student's name and year
  public Student() {

    setFirstName();
    setLastName();
    setClassLevel();
    setStudentId();

    courses = new ArrayList<String>();
  }

   // first name setter
   private void setFirstName() {
    System.out.print("Enter student first name: ");
    this.firstName = input.nextLine();
  }

  private void setLastName() {
    System.out.print("Enter student last name: ");
    this.lastName = input.nextLine();
  }

  private void setClassLevel() {
    System.out.print("Enter student class level: \n1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\n");
    this.classLevel = Integer.parseInt(input.nextLine());
  }

  // Generate ID
  private void setStudentId() {
    // first digit reflects their class level, grade + static id
    id++;
    this.studentId = classLevel + "" + id; 
  }

  // Enroll in courses
  public void enroll() {
    // prompt user to enroll in classes, enters "Q" to finish enrolling
    System.out.println("Enter course to enroll (Q to quit):");
    String course = input.nextLine();
    while(!course.equals("Q")) {
      courses.add(course);
      tuitionBalance += costOfClass;
      course = input.nextLine();
    }
  }
  // View balance
  public void viewBalance() {
    System.out.println("Your balance is: $" + tuitionBalance);
  }

  // Pay tuition
  public void payTuition() {
    viewBalance();
    System.out.println("Enter payment amount in $: ");
    int payment = Integer.parseInt(input.nextLine());
    tuitionBalance -= payment;
    System.out.println("Thank you for your payment of: $" + payment);
    viewBalance();
  }

  // Show status
  public String toString() {
    return "Name: " + firstName + " " + lastName + " " + 
            "\nClass: " + classLevel +
            "\nStudent ID: " + studentId +
            "\nEnrolled Courses: " + courses.toString() +
            "\nBalance: $" + tuitionBalance;
  }
}