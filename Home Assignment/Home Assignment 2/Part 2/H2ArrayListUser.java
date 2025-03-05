import java.util.*;
class User{
    private String name;
    private int age;
    
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
}
class UserAgeComparator implements Comparator<User> {
    public int compare(User u1, User u2) {
        return Integer.compare(u1.getAge(), u2.getAge());
    }
}
public class H2ArrayListUser {
    public static void main(String[] args) {
        ArrayList<User> user = new ArrayList<>();
        user.add(new User("John", 25));
        user.add(new User("Jenny", 23));
        user.add(new User("Jack", 24));
        System.out.println("Users before sorting their ages");
        for(User u:user){
            System.out.println(u.getName()+" "+u.getAge());
        }
        System.out.println("\n Users after sorting their ages");
        user.sort(new UserAgeComparator());
        for(User u:user){
            System.out.println(u.getName()+" "+u.getAge());
        }    
    }
}

