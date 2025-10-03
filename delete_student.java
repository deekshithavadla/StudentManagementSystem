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