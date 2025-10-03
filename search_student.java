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
