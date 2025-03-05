class Pair<K,V>{
    private K key;
    private V value;
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public K getKey() {
        return key;
    }
    public void setKey(K key) {
        this.key = key;
    }
    public V getValue() {
        return value;
    }
    public void setValue(V value) {
        this.value = value;
    }  
}
public class H1{
    public static void main(String[] args) {
        Pair<String,Integer> pair1 = new Pair<>("Example", 42);
        Pair<Integer,Double> pair2 = new Pair<>(7, 4.5);
        System.out.println("Pair1(Key: "+pair1.getKey()+",Value: "+pair1.getValue()+")");
        System.out.println("Pair2(Key: "+pair2.getKey()+",Value: "+pair2.getValue()+")");
    }
}