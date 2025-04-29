import java.util.*;
public class Office {
    public static void print(HashMap<Integer,Employee> map){
        for(Map.Entry<Integer,Employee> e: map.entrySet()){
            System.out.println("ID: "+e.getKey()+" "+e.getValue());
        }
    }
    public static void main(String[] args) {
        HashMap<Integer,Employee> employees = new HashMap<>();
        employees.put(121,new Employee("emp1",31,"dept1",20000));
        employees.put(122,new Employee("emp2",32,"CSE",30000));
        employees.put(123,new Employee("emp3",33,"dept1",25000));
        employees.put(124,new Employee("emp1",34,"dept1",25000));
        System.out.println("Before Sorting: ");
        print(employees);

        LinkedList<Map.Entry<Integer,Employee>> empList = new LinkedList<>(employees.entrySet());
        empList.sort((e1,e2)->new SortByDeptSalaryAndAge().compare(e1.getValue(),e2.getValue()));
        LinkedHashMap<Integer,Employee> sorted = new LinkedHashMap<>();
        for(Map.Entry<Integer,Employee> e: empList){
            sorted.put(e.getKey(),e.getValue());
        }

        System.out.println("After Sorting: ");
        print(sorted);
    }
}
