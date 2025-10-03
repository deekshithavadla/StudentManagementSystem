//2.view student details
    static void view_student(){
    System.out.println("\n--- Student List ---");
    for (Student s : students) {
         System.out.println( s.id + ". Name: " + s.name + ", Age: " + s.age);
    }
  }