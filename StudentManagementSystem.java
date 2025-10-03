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
    //1.Add student details 
    static void add_student(Scanner sc){
    System.out.print("Enter student name: ");
    String name = sc.nextLine();
    System.out.print("Enter student age: ");
    int age = sc.nextInt();
    students.add(new Student(idCounter++, name, age));//parameters of calss
       System.out.println("Student added successfully!");
    }

    //2.view student details
    static void view_student(){
    System.out.println("\n--- Student List ---");
    for (Student s : students) {
         System.out.println( s.id + ". Name: " + s.name + ", Age: " + s.age);
    }
  }

  // 3.searching student from id
     static void search_student(Scanner sc){
        System.out.print("Enter student ID to search: ");
        int searchId = sc.nextInt();
        sc.nextLine();
        for(Student s:students){
            if(s.id==searchId){
                System.out.println("Student found");
                System.out.println(s);
                return;
            }
    }
    System.out.println("Student not found!");
}
   //4.updating student details
   static void update_student(Scanner sc){
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
  }

    //5.delete student details
    static void delete_student(Scanner sc){ 
    System.out.print("Enter student ID to delete: ");
    int deleteId = sc.nextInt();
    Iterator<Student> it = students.iterator();//iterator is used to remove safely
    while (it.hasNext()) {//hasnext check whether it has next student details
     Student s = it.next();
        if (s.id == deleteId) {
            it.remove();
        System.out.println("Student deleted successfully!");
    }
  }
     System.out.println("Student not found!");
  }
     
}


