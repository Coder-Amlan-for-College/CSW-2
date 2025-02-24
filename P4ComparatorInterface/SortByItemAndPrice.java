package P4ComparatorInterface;
import java.util.Comparator;
public class SortByItemAndPrice implements Comparator<Food>{
    public int compare(Food food1, Food food2) {
        int result = food1.getItemName().compareTo(food2.getItemName());
        if (result == 0) {
            result = Double.compare(food1.getPrice(), food2.getPrice());
        }
        return result;
    }
}
