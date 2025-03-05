import java.util.*;
class Student{
    private String name;
    private int age;
    private double mark;
    public Student(String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return age == student.age &&
                mark == student.mark &&
                name.equals(student.name);
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", mark=" + mark + "]";
    }
    
}
public class H4 {
    public static void displayList(LinkedList<Student> students){
        for(Student student : students) {
            System.out.println(student);
        }
    }
    public static void searchStudentInList(LinkedList<Student> students, Student searchStudent){
         boolean found = students.contains(searchStudent);
         System.out.println(found ? "Student found" : "Student not found");
    }
    public static void removeStudentFromList(LinkedList<Student> students, Student removeStudent)
    {
        if(students.contains(removeStudent)){
            students.remove(removeStudent);
            System.out.println(removeStudent+"removed from the list");
        }
        else{
            System.out.println(removeStudent+"not found in the list");
        }
    }
    public static int countNoOfStudents(LinkedList<Student> students){
        return students.size();
    }
    public static void checkDuplicatesWithStream(LinkedList<Student> students){
        students.stream().distinct().filter(student -> Collections.frequency(students,student)>1).limit(1)
        .forEach(System.out::println);
    }
    public static void checkDuplicates(LinkedList<Student> students){
        boolean duplicateFound = false;
        for(Student student : students) {
            if(Collections.frequency(students, student)>1){
                System.out.println("Without stream check for duplicates");
                System.out.println(student);
                duplicateFound = true;
                break;
            }
        }
        if(!duplicateFound){
            System.out.println("No duplicates found");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Student> students = new LinkedList<>();
        students.add(new Student("John", 20, 85.5));
        students.add(new Student("Alice", 22, 90.0));
        students.add(new Student("Charlie", 19, 75));
        students.add(new Student("Charlie", 19, 75));
        System.out.println("Student List:");
        displayList(students);
        
        System.out.println("Enter details of the student to search(name, age, mark):");
        Student searchStudent = new Student(sc.next(),sc.nextInt(),sc.nextDouble());
        searchStudentInList(students,searchStudent);
        
        System.out.println("Enter details of the student to remove(name, age, mark):");
        Student removeStudent = new Student(sc.next(),sc.nextInt(),sc.nextDouble());
        removeStudentFromList(students,removeStudent);

        int count =  countNoOfStudents(students);
        System.out.println("Number of students in the list: "+count);

        checkDuplicatesWithStream(students);
        checkDuplicates(students);

    }
}
