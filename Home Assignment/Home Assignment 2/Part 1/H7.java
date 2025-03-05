import java.util.*;
class Student{
    String name;
    int rollNo;
    int age;
    public Student(String name, int rollNo, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }
    public String toString(){
        return "Student( Name: "+name+" Roll No: "+rollNo+" Age: "+age+")";
    }

}
class StudentRollNoComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
       return Integer.compare(s1.rollNo,s2.rollNo);
    }
}
class StudentAgeComparator implements Comparator<Student> {
      public int compare(Student s1, Student s2) {
         return Integer.compare(s1.age,s2.age);
      }
}
class StudetAgeRollNoComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        int ageComparison = Integer.compare(s1.age, s2.age);
        if(ageComparison==0){
            return Integer.compare(s1.rollNo,s2.rollNo);
        }
        return ageComparison;   
    }
}
public class H7 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("P1",3,20));
        students.add(new Student("P2",1,22));
        students.add(new Student("P3",2,21));
        students.add(new Student("P4",4,20));
        students.add(new Student("P5",5,20));
        students.sort(new StudentAgeComparator());
        System.out.println("Students sorted by age: ");
        for(Student s:students){
            System.out.println(s);
        }
        System.out.println("\n Students sorted by roll no: ");
        students.sort(new StudentRollNoComparator());
        for(Student s:students){
            System.out.println(s);
        }
        System.out.println("\n Students sorted by roll no and age: ");
        students.sort(new StudetAgeRollNoComparator());
        for(Student s:students){
            System.out.println(s);
        }
    }
}
