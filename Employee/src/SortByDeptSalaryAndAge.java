import java.util.*;
public class SortByDeptSalaryAndAge implements Comparator<Employee>{
   public int compare(Employee e1,Employee e2){
       int res = e1.getDept().toLowerCase().compareTo(e2.getDept().toLowerCase());
       if(res == 0){
           res = Double.compare(e2.getSalary(), e1.getSalary());
           if(res==0){
               res = Integer.compare(e1.getAge(),e2.getAge());
           }
       }
       return res;
    }
}
