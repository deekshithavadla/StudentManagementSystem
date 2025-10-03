//1.Add student details 
    static void add_student(Scanner sc){
    System.out.print("Enter student name: ");
    String name = sc.nextLine();
    System.out.print("Enter student age: ");
    int age = sc.nextInt();
    students.add(new Student(idCounter++, name, age));//parameters of calss
       System.out.println("Student added successfully!");
    }