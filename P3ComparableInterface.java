import java.util.Arrays;

public class P3ComparableInterface {
    public static void main(String[] args) {
        int n = 4;
        MyPair[]arr = new MyPair[n];
        arr[0] = new MyPair("abc",3);
        arr[1] = new MyPair("a",4);
        arr[2] = new MyPair("bc",5);
        arr[3] = new MyPair("a",2);
        Arrays.sort(arr);
        print(arr);
    }
    public  static void print(MyPair[] arr) {
        for (MyPair pair : arr) {
            System.out.println(pair);
        }
    }
}
class MyPair implements Comparable<MyPair> {
    String key;
    int value;
    public MyPair(String key, int value) {
        this.key = key;
        this.value = value;
    }
    public String toString() {
        return "("+key + "=" + value+")";
    }
    public int compareTo(MyPair other) {
        int keyComparison = this.key.compareTo(other.key);
        if (keyComparison != 0) {
            return keyComparison;
        }
        else
            return Integer.compare(this.value, other.value);
    }
}
