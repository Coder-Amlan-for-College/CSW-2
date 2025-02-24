package P4ComparatorInterface;

import java.util.Comparator;
public class SortByPrice implements Comparator<Food>{
     public int compare(Food food1, Food food2) {
         return Double.compare(food1.getPrice(), food2.getPrice());
     }
}
