public class BSTNode <K, V> {
private K key;
private V value;

private BSTNode<K> left, right;

public BSTNode(K key, V value, int size) {
        this.key = key;
        this.value = value;
        this.size = size;
}
}
