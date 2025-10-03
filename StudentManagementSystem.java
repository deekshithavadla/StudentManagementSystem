import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

// Student class to store student info
class Student {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {//constructors to pass the parameters
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
public class StudentManagementSystem {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        int idCounter = 1;//to increase the id number for each stdnt
    while(true){
    System.out.println("\n--- Student Management System ---");
    System.out.println("1. Add Student");
    System.out.println("2. View Students");
    System.out.println("3. Update Student");
    System.out.println("4. Delete Student");
    System.out.println("5. Exit");
    System.out.print("Enter your choice: ");
    choice = sc.nextInt();
    sc.nextLine(); // consume newline
    switch (choice) {
    case 1:
    System.out.print("Enter student name: ");
    String name = sc.nextLine();
    System.out.print("Enter student age: ");
    int age = sc.nextInt();
    students.add(new Student(idCounter++, name, age));//parameters of calss
    System.out.println("Student added successfully!");
    break;
    case 2:
    System.out.println("\n--- Student List ---");
    for (Student s : students) {
         System.out.println( s.id + ". Name: " + s.name + ", Age: " + s.age);
    }
    break;
    case 3:
    System.out.print("Enter student ID to update: ");
    int updateId = sc.nextInt();
    sc.nextLine(); // consume newline
    for (Student s : students) {
        if (s.id == updateId) {
            System.out.print("Enter new name: ");
            s.name = sc.nextLine();
            System.out.print("Enter new age: ");
            s.age = sc.nextInt();
            System.out.println("Student updated successfully!");
        }
    }
    System.out.println("Student not found!");
    break;

    case 4:
    System.out.print("Enter student ID to delete: ");
    int deleteId = sc.nextInt();
    Iterator<Student> it = students.iterator();//iterator is used to remove safely
    while (it.hasNext()) {//has next check whether it has next student
     Student s = it.next();
        if (s.id == deleteId) {
            it.remove();
        System.out.println("Student deleted successfully!");
    }
}
     System.out.println("Student not found!");
    break;
    case 5:
        System.out.println("Exiting system...");
        break;
        default:
        System.out.println("Invalid choice! Try again.");
     }
   } 

   }
}
