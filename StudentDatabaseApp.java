import java.util.Scanner;

public class StudentDatabaseApp {

  public static void main(String[] args) {
    //  Ask how many students to add
    System.out.println("Enter number of students to enroll: ");
    Scanner input = new Scanner(System.in);
    int numOfStudents = Integer.parseInt(input.nextLine());
    Student[] students = new Student[numOfStudents];

    // Create numOfStudents amount of students
    for (int n = 0; n < numOfStudents; n++) {
      students[n] = new Student();
      students[n].enroll();
      students[n].payTuition();
    }

    for (int n = 0; n < numOfStudents; n++) {
      System.out.println(students[n].toString());
    }
  }

}