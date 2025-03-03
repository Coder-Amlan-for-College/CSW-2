class Student<T>{
   private String name;
   private T rollNumber;
   private int age;

   public Student(String name, T rollNumber, int age)
   {
     this.name = name;
     this.rollNumber = rollNumber;
     this.age = age;
   }
   public String getName(){
      return name;
   }
   public T getRollNumber(){
    return rollNumber;
   }
   public int getAge(){
    return age;
   }
   public String toString(){
    return "Stuent{name: "+name+", Roll Number: "+rollNumber+", Age: "+age+"}";
   }
}
public class H1{
    public static void main(String[] args) {
        Student<Integer> s1 = new Student<Integer>("Rahul", 1, 20);
        Student<Integer> s2 = new Student<Integer>("Amlan", 25, 20);

    }
}