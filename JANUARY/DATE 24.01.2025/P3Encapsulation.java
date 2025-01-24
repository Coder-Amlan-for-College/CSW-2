public class P3Encapsulation {
     public static void main(String[] args) {
        Stud1 s1 = new Stud1();
        s1.setName("Amlan");
        System.out.println(s1.getName());
     } 
}
class Stud1{
   private String name;
   public String getName(){
    return name;
   }
   public void setName(String name){
      this.name = name;
   }
}