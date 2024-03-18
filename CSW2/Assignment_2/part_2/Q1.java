package part_2;
public class Q1 {
    public static void main(String[] args) {
        Pair<Integer, String> ob = new Pair<>(1, "anish");
        System.out.println("Key:" + ob.getKey() + "\tValue:" + ob.getValue()); //
    }
}

class Pair<E, V> {
    private E key;
    private V value;

    public Pair(E key, V value) {
        this.key = key;
        this.value = value;
    }

    public E getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }

    public void setKey(E e) {
        this.key = e;
    }

    public void setValue(V v) {
        this.value = v;
    }

}
/*
 * Output--
 * Key:1 Value:anish
 */