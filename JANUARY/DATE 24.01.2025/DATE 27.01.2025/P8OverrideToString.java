public class P8OverrideToString {

    public static void main(String[] args) {
        Stud s1 = new Stud(101, "Raj", "Lucknow");
        Stud s2 = new Stud(102, "Vijay", "Ghaziabad");
        System.out.println(s1);
        System.out.println(s2);

    }
}
class Stud{
    int rollno;
    String name,city;
    Stud(int rollno,String name,String city){
        this.rollno = rollno;
        this.name = name;
        this.city = city;
    }
    public String toString(){
        return rollno+" "+name+" "+city;
    }

}
