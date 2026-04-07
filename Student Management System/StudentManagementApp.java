import java.io.*;
import java.util.*;

// Student class
class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int rollNumber;
    private String grade;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String toString() {
        return "Name: " + name + " | Roll No: " + rollNumber + " | Grade: " + grade;
    }
}

// Main class
public class StudentManagementApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice;

            try {
                choice = sc.nextInt();
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("❌ Enter a valid number!");
                sc.nextLine();
                continue;
            }

            switch (choice) {

                // ✅ ADD STUDENT
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Roll Number: ");
                    int roll = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Grade: ");
                    String grade = sc.nextLine();

                    students.add(new Student(name, roll, grade));
                    System.out.println("✅ Student Added!");
                    break;

                // ✅ REMOVE STUDENT
                case 2:
                    System.out.print("Enter Roll Number to Remove: ");
                    int removeRoll = sc.nextInt();
                    sc.nextLine();

                    boolean removed = students.removeIf(s -> s.getRollNumber() == removeRoll);

                    if (removed) {
                        System.out.println("✅ Student Removed!");
                    } else {
                        System.out.println("❌ Student Not Found!");
                    }
                    break;

                // ✅ SEARCH STUDENT
                case 3:
                    System.out.print("Enter Roll Number to Search: ");
                    int searchRoll = sc.nextInt();
                    sc.nextLine();

                    boolean found = false;

                    for (Student s : students) {
                        if (s.getRollNumber() == searchRoll) {
                            System.out.println("✅ Found: " + s);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("❌ Student Not Found!");
                    }
                    break;

                // ✅ DISPLAY ALL STUDENTS
                case 4:
                    if (students.isEmpty()) {
                        System.out.println("⚠️ No students found.");
                    } else {
                        System.out.println("\n📋 STUDENT LIST");
                        System.out.println("----------------------------------");

                        for (int i = 0; i < students.size(); i++) {
                            System.out.println((i + 1) + ". " + students.get(i));
                        }

                        System.out.println("----------------------------------");
                    }
                    break;

                // ✅ EXIT
                case 5:
                    System.out.println("👋 Exiting...");
                    return;

                default:
                    System.out.println("❌ Invalid choice!");
            }
        }
    }
}