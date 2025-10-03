import java.util.*;

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
    @Override //Helps avoid mistakes and shows clean and readable output
    public String toString() { //print nicely instead of weird memory values
        return "ID: " + id + ", Name: " + name + ", Age: " + age;
    }
}
public class StudentManagementSystem {
     static ArrayList<Student> students = new ArrayList<>();
     static int idCounter = 1;  //to increase the id number for each stdnt
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    while(true){
        System.out.println("\n--- Student Management System ---");
        System.out.println("1. Add Student");
        System.out.println("2. View Students");
        System.out.println("3. Search student");
        System.out.println("4. Update Student");
        System.out.println("5. Delete Student");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline
        switch (choice) {
        case 1:add_student(sc);break;
        case 2:view_student();break;
        case 3:search_student(sc);break;
        case 4:update_student(sc);break;
        case 5:delete_student(sc);break;
        case 6:System.out.println("Exiting from System...");return;
        default:System.out.println("Invalid choice!");
            }
        }
    }
}