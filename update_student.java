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
