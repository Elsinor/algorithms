public class BST <K extends Comparable <K>, V> {
private BSTNode<K, V> root;
/**
 *
 * Aggiunge un nodo all'albero
 * con chiave e valore associato.
 * Complessità di tempo:
 * O(h) nel caso peggiore (h altezza dell'ABR)
 */
public void insert (K key, V value) {
        if (null == key) throw new IllegalArgumentException("Argument 'key' to insert() is null.");
        if (null == value) {
                delete(key);
                return;
        }
        root = put(root, key, value);
}

public void insert(BSTNode node, K key, V value) {
        if (null == x) return new BSTNode(key, value, 1);

        int cmp = key.compareTo(node.key);
        if (cmp < 0)
                node.left = put(node.left, key, value);
        else if (cmp > 0)
                node.right = put(node.right, key, value);
        else
                node.value = value;
        node.size = 1 + size(node.left) + size(node.right);
        return node;
}

/**
 * complessità di tempo:
 * O(h) nel caso peggiore (h altezza dell'ABR)
 * @param  key [description]
 * @return     [description]
 */
public V get (K key) {
        return get(root, key);
}

/**
 * Se la chiave è contenuta nell'ABR restituisce il valore associato,
 * altrimenti NULL.
 * @param  node [description]
 * @param  key  [description]
 * @return {@code V value} se la chiave viene trovata
 *         {@code NULL} altrimenti
 */
private V get(BSTNode node, K key) {
        if (null == key) throw new IllegalArgumentException("Argument 'key' to get() is null.");
        if (null == node) {
                return null;
        }

        int cmp = key.compareTo(node.key);
        if (cmp < 0)
                return get(node.left, key);
        else if (cmp > 0)
                return get(node.right, key);
        else return node.value;
}

/**
 *
 * Cancella il nodo con chiave k se è presente,
 * altrimenti nulla.
 *
 */
public void delete (K key) {

}

/**
 * Stampa i valore dell'ABR in ordine.
 *
 */
public void print(PrintStream p) {

}

public boolean isEmpty() {
        return 0 == size();
}

public int size () {
        return size(root);
}

private int size(BSTNode node) {
        return (null == node) ? 0 : node.size;
}

public boolean contains(K key) {
        if (null == key) throw new IllegalArgumentException("Argument 'key' to contains() is null");
        return null != get(key);
}


}
